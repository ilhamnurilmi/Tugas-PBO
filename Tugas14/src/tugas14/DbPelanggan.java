package tugas14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DbPelanggan {
    private Connection conn;
    private final Koneksi koneksi = new Koneksi();
    
    public ArrayList<Pelanggan> getPelanggan() throws SQLException{
        ArrayList<Pelanggan> daftar = new ArrayList<>();      
        
        conn = koneksi.getConnection();
        
        String kueri = "SELECT * FROM pelanggan";
        PreparedStatement ps = conn.prepareStatement(kueri);
        
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            String id = rs.getString("member");
            String nama = rs.getString("nama");
            String tahun = rs.getString("tahun_lahir");
            String jenis = rs.getString("jenis");
            
            Pelanggan p = new Pelanggan(id, nama, jenis, Integer.parseInt(tahun));
            daftar.add(p);
        }
        rs.close();
        ps.close();
        conn.close();
        return daftar;
    }
    
     public boolean insertPelanggan(Pelanggan p) throws SQLException{
        
        conn = koneksi.getConnection();
        
        String kueri = "INSERT INTO pelanggan(member,nama,jenis,tahun_lahir) VALUES (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(kueri);
        ps.setString(1, p.getId()); 
        ps.setString(2, p.getNama());
        ps.setString(3, p.getJenis()); 
        ps.setInt(4, p.getTahunLahir());
        int rowAffected = ps.executeUpdate();
        ps.close(); 
        conn.close();
        return rowAffected == 1;
    }
    
    public boolean updatePelanggan(Pelanggan p) throws SQLException{
        conn = koneksi.getConnection();
        
        String kueri = "UPDATE pelanggan SET nama=?, jenis=?, tahun_lahir=? WHERE member=?";
        PreparedStatement ps = conn.prepareStatement(kueri);
        ps.setString(1, p.getNama()); 
        ps.setString(2, p.getJenis());
        ps.setInt(3, p.getTahunLahir()); 
        ps.setString(4, p.getId());
        
        int rowAffected = ps.executeUpdate();
        
        ps.close(); 
        conn.close();
        return rowAffected == 1;
    }
    public boolean deletePelanggan(String id) throws SQLException{
        
        conn = koneksi.getConnection();
        
        String kueri = "DELETE FROM pelanggan WHERE member = ?";
        PreparedStatement ps = conn.prepareStatement(kueri);
        ps.setString(1, id); 
        
        int rowAffected = ps.executeUpdate();
        ps.close(); 
        conn.close();
        return rowAffected == 1;
    }
    
    public ArrayList<Pelanggan> cariPelanggan(String keyword) throws SQLException{
        ArrayList<Pelanggan> daftar = new ArrayList<>();
        
        conn = koneksi.getConnection();
        
        String kueri = "SELECT * FROM pelanggan WHERE nama LIKE ? OR tahun_lahir=? OR jenis=?";
        PreparedStatement ps = conn.prepareStatement(kueri);
        ps.setString(1, "%"+keyword+"%"); 
        ps.setString(2, keyword);
        ps.setString(3, keyword);  
        
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            String id = rs.getString("member");
            String nama = rs.getString("nama");
            String tahun = rs.getString("tahun_lahir");
            String jenis = rs.getString("jenis");
            
            Pelanggan p = new Pelanggan(id, nama, jenis, Integer.parseInt(tahun));
            daftar.add(p);
        }
        rs.close(); 
        ps.close();
        conn.close();
        return daftar;   
    }
}
