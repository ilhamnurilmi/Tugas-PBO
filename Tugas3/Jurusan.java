package com.company;

import java.util.ArrayList;

public class Jurusan {
    private String kode;
    private String nama;
    private ArrayList<Mahasiswa> mahasiswas;

    public Jurusan(String kode, String nama){
        this.kode = kode; this.nama = nama; this.mahasiswas = new ArrayList<>();
    }
    public void addMahasiswa(Mahasiswa mhs){
        this.mahasiswas.add(mhs);
    }
    public String getKode(){
        return kode;
    }
    public String getNama(){
        return nama;
    }
    public ArrayList<Mahasiswa> getMahasiswas(){
        return mahasiswas;
    }
}
