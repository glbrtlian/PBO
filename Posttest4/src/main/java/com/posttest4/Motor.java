package com.posttest4;

public class Motor extends Kendaraan implements KelolaKendaraan {
    private String namaPemilik;

    public Motor(String merk, String platNomor, String namaPemilik) {
        super(merk, platNomor);
        this.namaPemilik = namaPemilik;
    }

    public String getNamaPemilik() { return namaPemilik; }
    public void setNamaPemilik(String namaPemilik) { this.namaPemilik = namaPemilik; }

    @Override
    public void info() {
        System.out.println("Motor: " + merk + ", Plat: " + platNomor + ", Pemilik: " + namaPemilik);
    }

    @Override
    public void servis() {
        System.out.println("Servis motor " + merk + " (tune up mesin)");
    }

    public void servis(int km) {
        System.out.println("Servis motor " + merk + " pada km " + km);
    }

    @Override
    public void tambahData() {
        System.out.println("Motor berhasil ditambahkan");
    }

    @Override
    public void hapusData() {
        System.out.println("Motor berhasil dihapus");
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Pemilik: " + namaPemilik);
        System.out.println("------------------");
    }
}