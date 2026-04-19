package com.posttest4;

public class Sepeda extends Kendaraan implements KelolaKendaraan {
    private String jenisSepeda;

    public Sepeda(String merk, String platNomor, String jenisSepeda) {
        super(merk, platNomor);
        this.jenisSepeda = jenisSepeda;
    }

    public String getJenisSepeda() { return jenisSepeda; }
    public void setJenisSepeda(String jenisSepeda) { this.jenisSepeda = jenisSepeda; }

    @Override
    public void info() {
        System.out.println("Sepeda: " + merk + ", Plat: " + platNomor + ", Jenis: " + jenisSepeda);
    }

    @Override
    public void servis() {
        System.out.println("Servis sepeda " + merk + " (pelumas rantai)");
    }

    public void servis(double durasi) {
        System.out.println("Servis sepeda selama " + durasi + " jam");
    }

    @Override
    public void tambahData() {
        System.out.println("Sepeda berhasil ditambahkan");
    }

    @Override
    public void hapusData() {
        System.out.println("Sepeda berhasil dihapus");
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Jenis: " + jenisSepeda);
        System.out.println("------------------");
    }
}