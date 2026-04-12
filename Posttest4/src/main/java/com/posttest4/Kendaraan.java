package com.posttest4;

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

    // Overload: setMerk dengan parameter tambahan
    public void setMerk(String merk, String model) {
        this.merk = merk + " " + model;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    // Method untuk override
    public void info() {
        System.out.println("Kendaraan: " + merk + ", Plat: " + platNomor);
    }

    // Overload: servis tanpa parameter
    public void servis() {
        System.out.println("Servis kendaraan " + merk + " dilakukan.");
    }

    // Overload: servis dengan biaya
    public void servis(int biaya) {
        System.out.println("Servis kendaraan " + merk + " dengan biaya Rp" + biaya);
    }

    public void tampilData() {
        System.out.println("Merk: " + merk);
        System.out.println("Plat Nomor: " + platNomor);
    }
}