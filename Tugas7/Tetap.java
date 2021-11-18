package com.company;

public class Tetap extends Karyawan {
    private double tunjangan;

    public Tetap ( String nama, double tunjangan, double gaji ) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }
    public void display(){
        super.display();
        System.out.println("Tunjangan Dasar:" + tunjangan);
    }
}
