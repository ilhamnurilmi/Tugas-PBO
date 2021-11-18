package com.company;

public class Kontrak extends Karyawan {
    private int waktu;

    public Kontrak ( String nama, int waktu, double gaji ) {
        super(nama, gaji);
        this.waktu = waktu;
    }
    public void display () {
        super.display();
        System.out.println("Waktu : " + waktu);
    }
}

