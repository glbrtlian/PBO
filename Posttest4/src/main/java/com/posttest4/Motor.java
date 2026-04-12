package com.posttest4;

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

    // Override info()
    @Override
    public void info() {
        System.out.println("Motor: " + merk + ", Plat: " + platNomor + ", Pemilik: " + namaPemilik);
    }

    // Override servis()
    @Override
    public void servis() {
        System.out.println("Servis motor " + merk + " termasuk tune up mesin.");
    }

    // Overload: servis dengan kilometer
    public void servis(int km) {
        System.out.println("Servis motor " + merk + " pada km " + km);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("-------------------------");
    }
}