package com.company;

import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Customer> listCustomer = new ArrayList<>();
    static ArrayList<Driver> listDriver = new ArrayList<>();

    public static void main(String[] args) {
        int menu = 0;

        Customer customer1 = new Customer(60000, "67062044115", "Gekyume", "0851666999");
        listCustomer.add(customer1);

        Driver driver1 = new Driver(50000, "67062004141", "Killua", "0852676969", "D6666HXH", "Mobil");
        listDriver.add(driver1);

        do {
            System.out.println("\n===MEMBER JEK-GO====");
            System.out.println("1. Input data driver atau customer");
            System.out.println("2. Info driver atau customer");
            System.out.println("3. Top up saldo customer");
            System.out.println("4. Transaksi jasa antar");
            System.out.println("5. Keluar");
            System.out.println();
            System.out.print("Masukan nomor: ");
            menu = Integer.parseInt(input.next());

            switch (menu) {
                case 1: newMember();break;
                case 2: listInfoMember();break;
                case 3: topUp();break;
                case 4: jasaPengantaran();break;
                case 5: System.out.println("Bye bye");break;
                default: System.out.println("Tidak ada menu yang sesuai");break;
            }

        } while (menu != 5);
    }

    public static void newMember() {
        int saldo;
        String nik, nama,telfon;

        System.out.println("1. Customer");
        System.out.println("2. Driver");
        System.out.print("Pilihan type member: ");
        int typeMember = Integer.parseInt(input.next());

        System.out.print("Saldo member: ");
        saldo = Integer.parseInt(input.next());

        System.out.print("Nik member: ");
        nik = input.next();

        System.out.print("Nama member: ");
        nama = input.next();

        System.out.print("No telp member: ");
        telfon = input.next();

        if (typeMember == 1) {
            Customer newCustomer = new Customer(saldo, nik, nama, telfon);
            listCustomer.add(newCustomer);
        } else if (typeMember == 2) {

            System.out.print("Plat no member: ");
            String platNomor = input.next();

            System.out.print("Jenis kendaraan member: ");
            String jenisKendaraan = input.next();

            Driver newDriver = new Driver(saldo, nik, nama, telfon, platNomor, jenisKendaraan);
            listDriver.add(newDriver);

        } else {
            System.out.println("Tidak ada tipe member tersebut");
        }
    }

    public static void listInfoMember() {
        System.out.println("1. Customer");
        System.out.println("2. Driver");
        System.out.print("Pilihan type member: ");
        int typeMember = Integer.parseInt(input.next());
        System.out.println();

        if (typeMember == 1) {
            for (int i = 0; i < listCustomer.size(); i++) {
                System.out.println("No: " + (i + 1));
                listCustomer.get(i).memberInfo();
            }

        } else if (typeMember == 2) {
            for (int i = 0; i < listDriver.size(); i++) {
                System.out.println("No: " + (i + 1));
                listDriver.get(i).memberInfo();
            }

        } else {
            System.out.println("Tidak ada tipe member tersebut");
        }
        System.out.println();
    }

    public static void topUp() {
        System.out.print("No customer: ");
        int noCustomer = Integer.parseInt(input.next());

        System.out.print("No driver: ");
        int noDriver = Integer.parseInt(input.next());

        System.out.print("Jumlah saldo yang akan di topup: ");
        int jumlahSaldo = Integer.parseInt(input.next());

        Customer customer = listCustomer.get(noCustomer - 1);
        Driver driver = listDriver.get(noDriver - 1);
        customer.topUp(driver, jumlahSaldo);
    }

    public static void jasaPengantaran() {
        System.out.print("No customer: ");
        int noCustomer = Integer.parseInt(input.next());

        System.out.print("No driver: ");
        int noDriver = Integer.parseInt(input.next());

        System.out.print("Jumlah saldo yang akan di berikan: ");
        int jumlahSaldo = Integer.parseInt(input.next());

        Driver driver = listDriver.get(noDriver - 1);
        Customer customer = listCustomer.get(noCustomer - 1);
        driver.jasaPengantaran(customer, jumlahSaldo);
    }
}