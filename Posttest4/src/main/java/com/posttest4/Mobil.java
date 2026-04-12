package com.posttest4;

public class Mobil extends Kendaraan {
    private String ban;
    private String warna;

    public Mobil(String merk, String platNomor, String ban, String warna) {
        super(merk, platNomor);
        this.ban = ban;
        this.warna = warna;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Override info()
    @Override
    public void info() {
        System.out.println("Mobil: " + merk + ", Plat: " + platNomor + ", Ban: " + ban + ", Warna: " + warna);
    }

    // Override servis()
    @Override
    public void servis() {
        System.out.println("Servis mobil " + merk + " termasuk ganti oli dan cek rem.");
    }

    // Overload tambahan: servis dengan jenis
    public void servis(String jenis) {
        System.out.println("Servis mobil " + merk + " untuk " + jenis);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Ban: " + ban);
        System.out.println("Warna: " + warna);
        System.out.println("-------------------------");
    }
}