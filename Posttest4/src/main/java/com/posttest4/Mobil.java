package com.posttest4;

public class Mobil extends Kendaraan implements kelolaKendaraan {
    private String ban;
    private String warna;

    public Mobil(String merk, String platNomor, String ban, String warna) {
        super(merk, platNomor);
        this.ban = ban;
        this.warna = warna;
    }

    @Override
    public void info() {
        System.out.println("Mobil: " + merk + ", Plat: " + platNomor);
    }

    @Override
    public void servis() {
        System.out.println("Servis mobil " + merk);
    }

    @Override
    public void tambahData() {
        System.out.println("Mobil berhasil ditambahkan");
    }

    @Override
    public void hapusData() {
        System.out.println("Mobil berhasil dihapus");
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }
}