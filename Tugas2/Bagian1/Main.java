package com.company;

import java.util.*;

public class Main {
    private static final ArrayList<Buku> buku = new ArrayList<>();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String []args){
        int choose;

        do{
            System.out.println("1. Input Buku");
            System.out.println("2. Cari Buku/Ubah Buku");
            System.out.println("3. Tampilkan Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar");

            System.out.println("Pilih Nomber: ");
            choose = input.nextInt();

            switch (choose){
                case 1: inputBuku(); break;
                case 2: cariBuku(); break;
                case 3: tampilkanBuku(); break;
                case 4: hapusBuku(); break;
                case 5: System.out.println("Aplikasi berhenti"); break;
                default: System.out.println("Tidak ada pilihan"); break;
            }
        }while (choose !=5);
    }

    public static void cariBuku(){
        System.out.println("Pencarian Buku");
        System.out.println("Nomor ISBN: ");
        String isbn = input.next();
        Buku x = cariIsbn(isbn);
        if (x !=null){
            System.out.println("Data: " + x.getIsbn() + " " + x.getJudulBuku() + " " + x.getPengarang() + " " + x.getTahunTerbit() + " " + x.getHargaBuku() + " " + x.getRatingBuku());
            System.out.println("Ubah Data? (YES/NO): ");
            String jawaban = input.next();

            if(jawaban.equalsIgnoreCase("YES")){
                ubahData(x);
            }else{
                System.out.println("Kembali ke menu");
            }
        }
    }

    private static Buku cariIsbn(String isbn){
        Buku xFound = null;
        for (Buku x:buku){
            if(isbn.equals(x.getIsbn())){
                xFound = x;
            }
        }

        return xFound;
    }

    private static void ubahData(Buku x){
        System.out.println("Masukan judul buku: ");
        String newTitle = input.next();
        x.setJudulBuku(newTitle);

        System.out.println("Masukan pengarang: ");
        String newAuthor = input.next();
        x.setPengarang(newAuthor);

        System.out.println("Masukan tahun terbit: ");
        Integer newYear = input.nextInt();
        x.setTahunTerbit(newYear);

        System.out.println("Masukan harga: ");
        float newPrice = input.nextFloat();
        x.setHargaBuku(newPrice);

        System.out.println("Masukan rating: ");
        float newRate = input.nextFloat();
        x.setRatingBuku(newRate);

        System.out.println("Buku berhasil diubah\n");
    }

    private static void tampilkanBuku(){
        System.out.println("\nMenampilkan Data: ");
        int order = 1;
        for (Buku x:buku){
            System.out.println(order + ") " + x.getIsbn() + ", " + x.getJudulBuku() + ", " + x.getPengarang() + ", " + x.getTahunTerbit() + ", " + x.getHargaBuku() + ", " + x.getRatingBuku() + ", ");
            order++;
        }
        System.out.println();
    }

    private static void hapusBuku(){
        tampilkanBuku();
        System.out.println("Masukan nomber urut yang ingin dihapus: ");
        int order;
        order = input.nextInt();
        buku.remove(order-1);
        System.out.println("Data urutan " + order + " berhasil dihapus.\n");
    }

    private static void tampilkanBuku(Buku x){
        System.out.println("Identitas");
        System.out.println("Nama: " + x.getJudulBuku());
        System.out.println("ISBN: " + x.getIsbn() + "\n");
    }

    private static void inputBuku(){
        System.out.println("\nBuku Baru");
        System.out.println("Masukan judul: ");
        String judulBuku = input.next();

        System.out.println("Masukan isbn: ");
        String isbn = input.next();

        System.out.println("Masukan pengarang: ");
        String pengarang = input.next();

        System.out.println("Masukan tahun terbit: ");
        Integer tahunTerbit = input.nextInt();

        System.out.println("Masukan harga buku: ");
        float hargaBuku = input.nextFloat();

        System.out.println("Masukan rating buku: ");
        float ratingBuku = input.nextFloat();

        if(cariIsbn(isbn) !=null){
            System.out.println("Isbn sudah terdaftar \n Gunakan isbn unik\n");
        }else{
            Buku x = new Buku (isbn, judulBuku , pengarang, tahunTerbit, hargaBuku, ratingBuku);
            buku.add(x);
            System.out.println("Data tersimpan\n");
        }
    }
}
