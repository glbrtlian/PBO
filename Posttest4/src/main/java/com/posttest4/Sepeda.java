package com.posttest4;

public class Sepeda extends Kendaraan {
    private String jenisSepeda;

    public Sepeda(String merk, String platNomor, String jenisSepeda) {
        super(merk, platNomor);
        this.jenisSepeda = jenisSepeda;
    }

    public String getJenisSepeda() {
        return jenisSepeda;
    }

    public void setJenisSepeda(String jenisSepeda) {
        this.jenisSepeda = jenisSepeda;
    }

    // Override info()
    @Override
    public void info() {
        System.out.println("Sepeda: " + merk + ", Plat: " + platNomor + ", Jenis: " + jenisSepeda);
    }

    // Override servis()
    @Override
    public void servis() {
        System.out.println("Servis sepeda " + merk + " termasuk pelumas rantai.");
    }

    // Overload: servis dengan durasi
    public void servis(double durasi) {
        System.out.println("Servis sepeda " + merk + " selama " + durasi + " jam.");
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Jenis Sepeda: " + jenisSepeda);
        System.out.println("-------------------------");
    }
}