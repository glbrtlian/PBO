package com.posttest3;

public class Kendaraan {
    protected String merk;
    protected String platNomor;

    public Kendaraan(String merk, String platNomor) {
        this.merk = merk;
        this.platNomor = platNomor;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public void tampilData() {
        System.out.println("Merk: " + merk);
        System.out.println("Plat Nomor: " + platNomor);
    }
}