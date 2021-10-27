package com.company;

public class Main {

    public static void main(String[] args) {
        
        Kurir asuransiDanDropship = new Kurir(1, "N0001", "JNE", 21000, "Dropship1", "Surabaya", "Bejo", "DayeuhKolot", true, true, 40000);

        Kurir asuransi = new Kurir(2, "N0003", "J&T", 21000, "Eiger", "Bandung Kopo", "Tini", "DayeuhKolot", true, 40000);

        Kurir normal = new Kurir(3, "N0004", "Pos Indonesia", 23000, "Eiger", "Bandung Kopo", "Bambang","DayeuhKolot");

        Kurir dropship = new Kurir(4, "N0002", "Si Cepat", 24000, "Dropship2", "Pontianak", "Joko","DayeuhKolot", true);
    }
}
