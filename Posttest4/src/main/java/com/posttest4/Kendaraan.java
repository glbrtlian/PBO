package com.posttest4;

public abstract class Kendaraan {
    protected String merk;
    protected String platNomor;

    public Kendaraan(String merk, String platNomor) {
        this.merk = merk;
        this.platNomor = platNomor;
    }

    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }

    public void setMerk(String merk, String model) {
        this.merk = merk + " " + model;
    }

    public String getPlatNomor() { return platNomor; }
    public void setPlatNomor(String platNomor) { this.platNomor = platNomor; }

    // ABSTRACT METHOD
    public abstract void info();
    public abstract void servis();

    public void tampilData() {
        System.out.println("Merk: " + merk);
        System.out.println("Plat Nomor: " + platNomor);
    }

    public void tambahData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tambahData'");
    }
}