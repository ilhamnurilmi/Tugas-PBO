package tugas14;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {
    private final DefaultTableModel model = new DefaultTableModel();
    private DbPelanggan koneksi = new DbPelanggan();

    public Main() {
        initComponents();
         
        model.addColumn("No Member");
        model.addColumn("Nama");
        model.addColumn("Tahun Lahir");
        model.addColumn("Jenis");

        TabelMember.setModel(model);

        populateTable();
        ResetBtn.setVisible(false);
        HapusBtn.setVisible(false);
    }
    private void populateTable() {
        model.setRowCount(0);
        try {
            ArrayList<Pelanggan> daftar = koneksi.getPelanggan();
            for (Pelanggan p : daftar) {
                Object[] isiData = {p.getId(), p.getNama(), p.getTahunLahir(), p.getJenis()};
                model.addRow(isiData);
            }
        } catch (SQLException ex) {
            System.out.println("Eksepsi: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Exception: " + ex.getMessage());
        }

    }
    
    private void populateTable(String keyword) {
        model.setRowCount(0);
        try {
            ArrayList<Pelanggan> daftar = koneksi.cariPelanggan(keyword);
            for (Pelanggan p : daftar) {
                Object[] isiData = {p.getId(), p.getNama(), p.getTahunLahir(), p.getJenis()};
                model.addRow(isiData);
            }
        } catch (SQLException ex) {
            System.out.println("Eksepsi: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Exception: " + ex.getMessage());
        }

    }
    
    private void kosongkan() {
        IdField.setText("");
        NamaField.setText("");
        TahunComboBox.setSelectedIndex(0);
        JenisComboBox.setSelectedIndex(0);
        IdField.setEditable(true);
        SimpanBtn.setText("Simpan");
        ResetBtn.setVisible(false);
        HapusBtn.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NamaField = new javax.swing.JTextField();
        IdField = new javax.swing.JTextField();
        TahunComboBox = new javax.swing.JComboBox<>();
        JenisComboBox = new javax.swing.JComboBox<>();
        SimpanBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        HapusBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelMember = new javax.swing.JTable();
        CariField = new javax.swing.JTextField();
        CariBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Formulir data pelanggan");

        jLabel2.setText("Id");

        jLabel3.setText("Nama");

        jLabel4.setText("Tahun lahir");

        jLabel5.setText("Jenis member");

        TahunComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", " " }));

        JenisComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gold", "Silver", "Platinum" }));
        JenisComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JenisComboBoxActionPerformed(evt);
            }
        });

        SimpanBtn.setText("Simpan");
        SimpanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanBtnActionPerformed(evt);
            }
        });

        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        HapusBtn.setText("Hapus");
        HapusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusBtnActionPerformed(evt);
            }
        });

        TabelMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMemberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelMember);

        CariBtn.setText("Cari");
        CariBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SimpanBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResetBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HapusBtn)
                                .addGap(71, 71, 71)
                                .addComponent(CariField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CariBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                    .addGap(45, 45, 45)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(NamaField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(IdField, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(TahunComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(391, 391, 391))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(30, 30, 30)
                                    .addComponent(JenisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel1)))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NamaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TahunComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JenisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SimpanBtn)
                    .addComponent(ResetBtn)
                    .addComponent(HapusBtn)
                    .addComponent(CariBtn)
                    .addComponent(CariField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanBtnActionPerformed
        String nomor = IdField.getText();
        String nama = NamaField.getText();
        String jenis = JenisComboBox.getSelectedItem().toString();
        String tahunLahir = TahunComboBox.getSelectedItem().toString();
        Pelanggan p = new Pelanggan(nomor, nama, jenis, Integer.parseInt(tahunLahir));

        if (SimpanBtn.getText().equals("Simpan")) {
            try {
                if (koneksi.insertPelanggan(p)) {
                    JOptionPane.showMessageDialog(this, "Berhasil Insert");
                    populateTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal Insert");
                }
            } catch (SQLException ex) {
                System.out.println("Eksepsi: " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "Exception: " + ex.getMessage());
            }
        } else {
            try {
                int jawaban = JOptionPane.showConfirmDialog(this, "Ubah Data " + p.getId() + "?", "Ubah", JOptionPane.YES_NO_OPTION);
                if (jawaban == JOptionPane.YES_OPTION) {
                    if (koneksi.updatePelanggan(p)) {
                        JOptionPane.showMessageDialog(this, "Berhasil Update");
                        populateTable();
                    } else {
                        JOptionPane.showMessageDialog(this, "Gagal Update");
                    }
                }
            } catch (SQLException ex) {
                System.out.println("Eksepsi: " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "Exception: " + ex.getMessage());
            }
        }
        kosongkan();
    }//GEN-LAST:event_SimpanBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        kosongkan();
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void CariBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariBtnActionPerformed
        String keyword = CariField.getText();
        populateTable(keyword);
    }//GEN-LAST:event_CariBtnActionPerformed

    private void HapusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusBtnActionPerformed
        int selectedRow = TabelMember.getSelectedRow();
        String id = model.getValueAt(selectedRow, 0).toString();
        int jawaban = JOptionPane.showConfirmDialog(this, "Hapus Data " + id + "?", "Hapus", JOptionPane.YES_NO_OPTION);
        if (jawaban == JOptionPane.YES_OPTION) {
            try {
                if (koneksi.deletePelanggan(id)) {
                    JOptionPane.showMessageDialog(this, "Berhasil Delete");
                    populateTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal Delete");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Eksepsi: " + e.getMessage());
            }

        }
    }//GEN-LAST:event_HapusBtnActionPerformed

    private void TabelMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMemberMouseClicked
        int selectedRow = TabelMember.getSelectedRow();
        String id = model.getValueAt(selectedRow, 0).toString();
        String nama = model.getValueAt(selectedRow, 1).toString();
        String tahun = model.getValueAt(selectedRow, 2).toString();
        String jenis = model.getValueAt(selectedRow, 3).toString();

        IdField.setText(id);
        IdField.setEditable(false);
        NamaField.setText(nama);
        JenisComboBox.setSelectedItem(jenis);
        TahunComboBox.setSelectedItem(tahun);
        SimpanBtn.setText("Ubah");
        ResetBtn.setVisible(true);
        HapusBtn.setVisible(true);
    }//GEN-LAST:event_TabelMemberMouseClicked

    private void JenisComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JenisComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JenisComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CariBtn;
    private javax.swing.JTextField CariField;
    private javax.swing.JButton HapusBtn;
    private javax.swing.JTextField IdField;
    private javax.swing.JComboBox<String> JenisComboBox;
    private javax.swing.JTextField NamaField;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SimpanBtn;
    private javax.swing.JTable TabelMember;
    private javax.swing.JComboBox<String> TahunComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
