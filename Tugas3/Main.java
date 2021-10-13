package com.company;

public class Main {

    public static void main(String[] args) {
        Jurusan jrs1 = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Jurusan jrs2 = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");

        Mahasiswa mhs1 = new Mahasiswa ("6701", "Rendi");
        Mahasiswa mhs2 = new Mahasiswa ("6702", "Chaca");
        Mahasiswa mhs3 = new Mahasiswa ("6703", "Agus");

        Mahasiswa mhs4 = new Mahasiswa ("6301", "Ridwan");
        Mahasiswa mhs5 = new Mahasiswa ("6302", "Siska");
        Mahasiswa mhs6 = new Mahasiswa ("6303", "Zayn");
        Mahasiswa mhs7 = new Mahasiswa ("63-04", "Rahmat");

        jrs1.addMahasiswa(mhs1);
        jrs1.addMahasiswa(mhs2);
        jrs1.addMahasiswa(mhs3);

        jrs2.addMahasiswa(mhs4);
        jrs2.addMahasiswa(mhs5);
        jrs2.addMahasiswa(mhs6);
        jrs2.addMahasiswa(mhs7);

        int nomor = 1;
        System.out.println("Kode: " + jrs1.getKode() + "\n" + "Jurusan: " + jrs1.getNama() + "\n" +  "Daftar Mahasiswa: " );

        for (Mahasiswa mhs : jrs1.getMahasiswas()){
            System.out.println(nomor + ". " + mhs.getNim() + " - " + mhs.getNama()); nomor++;
        }

        System.out.println();

        nomor = 1;
        System.out.println("Kode: " + jrs2.getKode() + "\n" + "Jurusan: " + jrs2.getNama() + "\n" +  "Daftar Mahasiswa: " );

        for (Mahasiswa mhs : jrs2.getMahasiswas()){
            System.out.println(nomor + ". " + mhs.getNim() + " - " + mhs.getNama()); nomor++;
        }
    }
}
