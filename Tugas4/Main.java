package com.company;

public class Main {
    public static void main(String[] args){

        Buku book1 = new Buku("Harry Potter", "J.K Rowling", 30000);
        Buku book2 = new Buku("UML", "Ivar Jacobson", 40000);

        book1.printData();
        System.out.println();
        book2.printData();
    }
}
