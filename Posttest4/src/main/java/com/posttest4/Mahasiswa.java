package com.posttest4;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;

    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    // Overload: tampilData tanpa parameter
    public void tampilData() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("-------------------------");
    }

    // Overload: tampilData dengan detail tambahan
    public void tampilData(boolean detail) {
        tampilData();
        if (detail) {
            System.out.println("Mahasiswa aktif di jurusan " + jurusan);
        }
    }

    // Method belajar dengan overload
    public void belajar() {
        System.out.println(nama + " sedang belajar.");
    }

    public void belajar(String mataKuliah) {
        System.out.println(nama + " sedang belajar " + mataKuliah);
    }
}