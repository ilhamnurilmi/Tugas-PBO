package com.company;

public class Member {
    protected  int saldo;
    protected String nik, nama, telfon;

    public Member(int saldo, String nik, String nama, String telfon) {
        this.saldo = saldo;
        this.nik = nik;
        this.nama = nama;
        this.telfon = telfon;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void memberInfo() {
        System.out.println("Nik: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("No Telp: " + telfon);
        System.out.println("Saldo: " + saldo);
    }
}
