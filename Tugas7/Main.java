package com.company;

public class Main {

    public static void main(String[] args) {

        Karyawan k1 = new Tetap("Daniel", 40, 75);
        Karyawan k2 = new Tetap("Bintang", 45, 79);
        Karyawan k3 = new Kontrak("Nita", 35, 80);

        Departemen departemen = new Departemen("Joyer");

        departemen.addKaryawan(k1);
        departemen.addKaryawan(k2);
        departemen.addKaryawan(k3);

        System.out.println("\nDATA SEMUA KARYAWAN");
        System.out.println("=====================");
        departemen.displayAll();
        System.out.println("\nDATA KARYAWAN TETAP");
        System.out.println("=====================");
        departemen.displayTetap();
        System.out.println("\nDATA KARYAWAN KONTRAK");
        System.out.println("=====================");
        departemen.displayKontrak();
    }
}

