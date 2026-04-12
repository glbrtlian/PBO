package com.posttest3;

public class Motor extends Kendaraan {
    private String namaPemilik;

    public Motor(String merk, String platNomor, String namaPemilik) {
        super(merk, platNomor);
        this.namaPemilik = namaPemilik;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("-------------------------");
    }
}