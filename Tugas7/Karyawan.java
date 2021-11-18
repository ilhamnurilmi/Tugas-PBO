package com.company;

public class Karyawan {
    protected String nama;
    protected double gaji;

    public Karyawan(String nama, double gaji){
        this.nama = nama;
        this.gaji = gaji;
    }
    public void display(){
        System.out.println("Nama: "+nama);
        System.out.println("Gaji Dasar: "+gaji);
    }
}
