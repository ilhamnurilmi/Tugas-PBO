package com.company;

public class Buku {
    private String judulBuku;
    private String pengarang;
    private double hargaBuku;

    public Buku (String judulBuku, String pengarang, double hargaBuku){

        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.hargaBuku = hargaBuku;

    }

    public String getJudulBuku(){
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku){
        this.judulBuku = judulBuku;
    }

    public String getPengarang(){
        return pengarang;
    }

    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }

    public double getHargaBuku(){
        return hargaBuku;
    }

    public void setHargaBuku(double hargaBuku){
        this.hargaBuku = hargaBuku;
    }

    public void printData(){
        System.out.println("Judul Buku: " + this.getJudulBuku());
        System.out.println("Pengarang: " + this.getPengarang());
        System.out.println("Harga Buku: " + this.getHargaBuku());

    }
}
