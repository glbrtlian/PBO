package com.posttest3;

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

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Jenis Sepeda: " + jenisSepeda);
        System.out.println("-------------------------");
    }
}