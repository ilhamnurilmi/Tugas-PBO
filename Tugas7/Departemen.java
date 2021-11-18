package com.company;

import java.util.ArrayList;

public class Departemen {
    private String nama;
    private ArrayList<Karyawan> karyawan = new ArrayList<>();

    public
    Departemen ( String nama ) {
        this.nama = nama;
    }

    public
    void addKaryawan ( Karyawan k ) {
        karyawan.add(k);
    }

    public
    void displayAll () {
        for (Karyawan k : karyawan) {
            k.display();
        }
    }

    public
    void displayKontrak () {
        for (Karyawan k : karyawan) {
            if (k instanceof Kontrak) {
                k.display();
            }
        }
    }

    public
    void displayTetap () {
        for (Karyawan k : karyawan) {
            if (k instanceof Tetap) {
                k.display();
            }
        }
    }
}
