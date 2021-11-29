package com.company;

public class Customer extends Member{
    public Customer(int saldo, String nik, String nama, String telfon) {
        super(saldo, nik, nama, telfon);
    }

    public void topUp(Driver driver, int totalSaldo) {

        if (driver.getSaldo() < totalSaldo) {
            System.out.println("Saldo kurang");
        } else {
            this.setSaldo(this.getSaldo() + totalSaldo);
            driver.setSaldo(driver.getSaldo() - totalSaldo);
            System.out.println("Top Up berhasil");
        }

    }
}
