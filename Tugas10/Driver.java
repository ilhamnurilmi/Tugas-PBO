package com.company;

public class Driver extends Member{
    private String platNomor, jenisKendaraan;

    public Driver(int saldo, String nik, String nama, String telfon, String platNomor, String jenisKendaraan) {
        super(saldo, nik, nama, telfon);
        this.platNomor = platNomor;
        this.jenisKendaraan = jenisKendaraan;
    }

    public void jasaPengantaran(Customer customer, int jumlahBiaya) {
        if (customer.getSaldo() < jumlahBiaya) {
            System.out.println("Saldo member kurang");
        } else {
            this.setSaldo(this.getSaldo() + jumlahBiaya);
            customer.setSaldo(customer.getSaldo() - jumlahBiaya);
            System.out.println("Berhasil melakukan transaksi");
        }
    }

    @Override
    public void memberInfo(){
        super.memberInfo();
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Kendaraan: " + jenisKendaraan);
    }
}
