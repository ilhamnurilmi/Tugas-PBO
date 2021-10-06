package com.company;

public class Buku {
    private final String isbn;
    private String judulBuku;
    private String pengarang;
    private int tahunTerbit;

    private float hargaBuku;
    private float ratingBuku;

    public Buku(String isbn,String judulBuku, String pengarang, int tahunTerbit, float hargaBuku, float ratingBuku){
        this.isbn = isbn;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.hargaBuku = hargaBuku;
        this.ratingBuku = ratingBuku;
    }

    public String getIsbn(){
        return isbn;
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

    public float getHargaBuku(){
        return hargaBuku;
    }

    public void setHargaBuku(float hargaBuku) {
        this.hargaBuku = hargaBuku;
    }

    public int getTahunTerbit(){
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }

    public float getRatingBuku() {
        return ratingBuku;
    }

    public void setRatingBuku(float ratingBuku) {
        this.ratingBuku = ratingBuku;
    }
}
