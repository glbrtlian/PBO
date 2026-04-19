package com.posttest4;

public class Mobil extends Kendaraan implements KelolaKendaraan {
    private String ban;
    private String warna;

    public Mobil(String merk, String platNomor, String ban, String warna) {
        super(merk, platNomor);
        this.ban = ban;
        this.warna = warna;
    }

    @Override
    public void info() {
        System.out.println("Mobil: " + merk + ", Plat: " + platNomor + ", Ban: " + ban + ", Warna: " + warna);
    }

    @Override
    public void servis() {
        System.out.println("Servis mobil " + merk);
    }

    // Overload
    public void servis(String jenis) {
        System.out.println("Servis mobil " + merk + " untuk " + jenis);
    }

    @Override
    public void tambahData() {
        System.out.println("Mobil berhasil ditambahkan");
    }

    @Override
    public void hapusData() {
        System.out.println("Mobil berhasil dihapus");
    }
}