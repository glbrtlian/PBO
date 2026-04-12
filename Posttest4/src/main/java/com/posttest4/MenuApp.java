package com.posttest4;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuApp {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Mobil> mobils = new ArrayList<>();
    private static ArrayList<Motor> motors = new ArrayList<>();
    private static ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
    private static ArrayList<Sepeda> sepedas = new ArrayList<>();
    private static ArrayList<Kendaraan> kendaraans = new ArrayList<>(); // Untuk demo polymorphism

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Kelola Mobil");
            System.out.println("2. Kelola Motor");
            System.out.println("3. Kelola Mahasiswa");
            System.out.println("4. Kelola Sepeda");
            System.out.println("5. Tampilkan Semua Data");
            System.out.println("6. Demo Polymorphism");
            System.out.println("0. Exit");
            System.out.print("Pilih: ");
            int m = readInt();
            switch (m) {
                case 1:
                    menuMobil();
                    break;
                case 2:
                    menuMotor();
                    break;
                case 3:
                    menuMahasiswa();
                    break;
                case 4:
                    menuSepeda();
                    break;
                case 5:
                    tampilSemua();
                    break;
                case 6:
                    demoPolymorphism();
                    break;
                case 0:
                    System.out.println("Keluar. Terima kasih.");
                    return;
                default:
                    System.out.println("Pilihan tidak dikenal");
            }
        }
    }

    static void menuMobil() {
        while (true) {
            System.out.println("\n-- MENU MOBIL --");
            System.out.println("1. Create");
            System.out.println("2. Read (list)");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            int p = readInt();
            switch (p) {
                case 1:
                    System.out.print("Merk: ");
                    String merk = readLine();
                    System.out.print("Plat Nomor: ");
                    String plat = readLine();
                    System.out.print("Ban: ");
                    String ban = readLine();
                    System.out.print("Warna: ");
                    String warna = readLine();
                    if (merk.isEmpty() || plat.isEmpty() || ban.isEmpty() || warna.isEmpty()) {
                        System.out.println("Semua field harus diisi.");
                    } else {
                        Mobil m = new Mobil(merk, plat, ban, warna);
                        mobils.add(m);
                        kendaraans.add(m); // Tambah ke list polymorphism
                        System.out.println("Mobil ditambahkan.");
                    }
                    break;
                case 2:
                    if (mobils.isEmpty()) System.out.println("Tidak ada data mobil.");
                    else {
                        for (int i = 0; i < mobils.size(); i++) {
                            Mobil mm = mobils.get(i);
                            System.out.printf("%d. %s | %s | %s | %s\n", i+1, mm.getMerk(), mm.getPlatNomor(), mm.getBan(), mm.getWarna());
                        }
                    }
                    break;
                case 3:
                    System.out.print("Index mobil (1..): ");
                    int idx = readInt()-1;
                    if (validIndex(idx, mobils.size())) {
                        Mobil mm = mobils.get(idx);
                        System.out.print("Merk baru (enter=skip): ");
                        String nm = readLine(); if (!nm.isEmpty()) mm.setMerk(nm);
                        System.out.print("Plat baru (enter=skip): ");
                        String np = readLine(); if (!np.isEmpty()) mm.setPlatNomor(np);
                        System.out.print("Ban baru (enter=skip): ");
                        String nb = readLine(); if (!nb.isEmpty()) mm.setBan(nb);
                        System.out.print("Warna baru (enter=skip): ");
                        String nw = readLine(); if (!nw.isEmpty()) mm.setWarna(nw);
                        System.out.println("Data mobil diperbarui.");
                    } else System.out.println("Index tidak valid.");
                    break;
                case 4:
                    System.out.print("Index mobil hapus (1..): ");
                    int idd = readInt()-1;
                    if (validIndex(idd, mobils.size())) {
                        mobils.remove(idd);
                        // Hapus dari kendaraans juga jika perlu, tapi skip untuk sederhana
                        System.out.println("Terhapus.");
                    } else System.out.println("Index tidak valid.");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Pilihan tidak dikenal");
            }
        }
    }

    static void menuMotor() {
        while (true) {
            System.out.println("\n-- MENU MOTOR --");
            System.out.println("1. Create");
            System.out.println("2. Read (list)");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            int p = readInt();
            switch (p) {
                case 1:
                    System.out.print("Merk Motor: ");
                    String merk = readLine();
                    System.out.print("Plat Nomor: ");
                    String plat = readLine();
                    System.out.print("Nama Pemilik: ");
                    String pemilik = readLine();
                    if (merk.isEmpty() || plat.isEmpty() || pemilik.isEmpty()) {
                        System.out.println("Semua field harus diisi.");
                    } else {
                        Motor m = new Motor(merk, plat, pemilik);
                        motors.add(m);
                        kendaraans.add(m);
                        System.out.println("Motor ditambahkan.");
                    }
                    break;
                case 2:
                    if (motors.isEmpty()) System.out.println("Tidak ada data motor.");
                    else {
                        for (int i = 0; i < motors.size(); i++) {
                            Motor k = motors.get(i);
                            System.out.printf("%d. %s | %s | %s\n", i+1, k.getMerk(), k.getPlatNomor(), k.getNamaPemilik());
                        }
                    }
                    break;
                case 3:
                    System.out.print("Index motor (1..): ");
                    int idx = readInt()-1;
                    if (validIndex(idx, motors.size())) {
                        Motor k = motors.get(idx);
                        System.out.print("Merk baru (enter=skip): ");
                        String nm = readLine(); if (!nm.isEmpty()) k.setMerk(nm);
                        System.out.print("Plat baru (enter=skip): ");
                        String np = readLine(); if (!np.isEmpty()) k.setPlatNomor(np);
                        System.out.print("Pemilik baru (enter=skip): ");
                        String npem = readLine(); if (!npem.isEmpty()) k.setNamaPemilik(npem);
                        System.out.println("Data motor diperbarui.");
                    } else System.out.println("Index tidak valid.");
                    break;
                case 4:
                    System.out.print("Index motor hapus (1..): ");
                    int idd = readInt()-1;
                    if (validIndex(idd, motors.size())) {
                        motors.remove(idd);
                        System.out.println("Terhapus.");
                    } else System.out.println("Index tidak valid.");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Pilihan tidak dikenal");
            }
        }
    }

    static void menuMahasiswa() {
        while (true) {
            System.out.println("\n-- MENU MAHASISWA --");
            System.out.println("1. Create");
            System.out.println("2. Read (list)");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            int p = readInt();
            switch (p) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = readLine();
                    System.out.print("Nama: ");
                    String nama = readLine();
                    System.out.print("Jurusan: ");
                    String jur = readLine();
                    if (nim.isEmpty() || nama.isEmpty() || jur.isEmpty()) {
                        System.out.println("Semua field harus diisi.");
                    } else {
                        mahasiswas.add(new Mahasiswa(nim, nama, jur));
                        System.out.println("Mahasiswa ditambahkan.");
                    }
                    break;
                case 2:
                    if (mahasiswas.isEmpty()) System.out.println("Tidak ada data mahasiswa.");
                    else {
                        for (int i = 0; i < mahasiswas.size(); i++) {
                            Mahasiswa mm = mahasiswas.get(i);
                            System.out.printf("%d. %s | %s | %s\n", i+1, mm.getNim(), mm.getNama(), mm.getJurusan());
                        }
                    }
                    break;
                case 3:
                    System.out.print("Index mahasiswa (1..): ");
                    int idx = readInt()-1;
                    if (validIndex(idx, mahasiswas.size())) {
                        Mahasiswa mm = mahasiswas.get(idx);
                        System.out.print("NIM baru (enter=skip): ");
                        String nn = readLine(); if (!nn.isEmpty()) mm.setNim(nn);
                        System.out.print("Nama baru (enter=skip): ");
                        String nma = readLine(); if (!nma.isEmpty()) mm.setNama(nma);
                        System.out.print("Jurusan baru (enter=skip): ");
                        String nj = readLine(); if (!nj.isEmpty()) mm.setJurusan(nj);
                        System.out.println("Data mahasiswa diperbarui.");
                    } else System.out.println("Index tidak valid.");
                    break;
                case 4:
                    System.out.print("Index mahasiswa hapus (1..): ");
                    int idd = readInt()-1;
                    if (validIndex(idd, mahasiswas.size())) {
                        mahasiswas.remove(idd);
                        System.out.println("Terhapus.");
                    } else System.out.println("Index tidak valid.");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Pilihan tidak dikenal");
            }
        }
    }

    static void menuSepeda() {
        while (true) {
            System.out.println("\n-- MENU SEPEDA --");
            System.out.println("1. Create");
            System.out.println("2. Read (list)");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            int p = readInt();
            switch (p) {
                case 1:
                    System.out.print("Merk Sepeda: ");
                    String merk = readLine();
                    System.out.print("Plat Nomor: ");
                    String plat = readLine();
                    System.out.print("Jenis Sepeda: ");
                    String jenis = readLine();
                    if (merk.isEmpty() || plat.isEmpty() || jenis.isEmpty()) {
                        System.out.println("Semua field harus diisi.");
                    } else {
                        Sepeda s = new Sepeda(merk, plat, jenis);
                        sepedas.add(s);
                        kendaraans.add(s);
                        System.out.println("Sepeda ditambahkan.");
                    }
                    break;
                case 2:
                    if (sepedas.isEmpty()) System.out.println("Tidak ada data sepeda.");
                    else {
                        for (int i = 0; i < sepedas.size(); i++) {
                            Sepeda s = sepedas.get(i);
                            System.out.printf("%d. %s | %s | %s\n", i+1, s.getMerk(), s.getPlatNomor(), s.getJenisSepeda());
                        }
                    }
                    break;
                case 3:
                    System.out.print("Index sepeda (1..): ");
                    int idx = readInt()-1;
                    if (validIndex(idx, sepedas.size())) {
                        Sepeda s = sepedas.get(idx);
                        System.out.print("Merk baru (enter=skip): ");
                        String nm = readLine(); if (!nm.isEmpty()) s.setMerk(nm);
                        System.out.print("Plat baru (enter=skip): ");
                        String np = readLine(); if (!np.isEmpty()) s.setPlatNomor(np);
                        System.out.print("Jenis baru (enter=skip): ");
                        String nj = readLine(); if (!nj.isEmpty()) s.setJenisSepeda(nj);
                        System.out.println("Data sepeda diperbarui.");
                    } else System.out.println("Index tidak valid.");
                    break;
                case 4:
                    System.out.print("Index sepeda hapus (1..): ");
                    int idd = readInt()-1;
                    if (validIndex(idd, sepedas.size())) {
                        sepedas.remove(idd);
                        System.out.println("Terhapus.");
                    } else System.out.println("Index tidak valid.");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Pilihan tidak dikenal");
            }
        }
    }

    static void tampilSemua() {
        System.out.println("\n=== Daftar Mobil ===");
        if (mobils.isEmpty()) System.out.println("(kosong)");
        else for (int i=0;i<mobils.size();i++) System.out.printf("%d. %s | %s | %s | %s\n", i+1, mobils.get(i).getMerk(), mobils.get(i).getPlatNomor(), mobils.get(i).getBan(), mobils.get(i).getWarna());

        System.out.println("\n=== Daftar Motor ===");
        if (motors.isEmpty()) System.out.println("(kosong)");
        else for (int i=0;i<motors.size();i++) System.out.printf("%d. %s | %s | %s\n", i+1, motors.get(i).getMerk(), motors.get(i).getPlatNomor(), motors.get(i).getNamaPemilik());

        System.out.println("\n=== Daftar Sepeda ===");
        if (sepedas.isEmpty()) System.out.println("(kosong)");
        else for (int i=0;i<sepedas.size();i++) System.out.printf("%d. %s | %s | %s\n", i+1, sepedas.get(i).getMerk(), sepedas.get(i).getPlatNomor(), sepedas.get(i).getJenisSepeda());

        System.out.println("\n=== Daftar Mahasiswa ===");
        if (mahasiswas.isEmpty()) System.out.println("(kosong)");
        else for (int i=0;i<mahasiswas.size();i++) System.out.printf("%d. %s | %s | %s\n", i+1, mahasiswas.get(i).getNim(), mahasiswas.get(i).getNama(), mahasiswas.get(i).getJurusan());
    }

    static void demoPolymorphism() {
        System.out.println("\n=== DEMO POLYMORPHISM ===");
        System.out.println("Menampilkan info semua kendaraan (Override):");
        for (Kendaraan k : kendaraans) {
            k.info();
        }
        System.out.println("\nDemo servis (Override):");
        for (Kendaraan k : kendaraans) {
            k.servis();
        }
        System.out.println("\nDemo overload servis:");
        if (!kendaraans.isEmpty()) {
            Kendaraan k = kendaraans.get(0);
            k.servis(50000); // Overload dengan biaya
            if (k instanceof Mobil) {
                ((Mobil) k).servis("Ganti Ban"); // Overload spesifik
            }
        }
        System.out.println("\nDemo overload di Mahasiswa:");
        if (!mahasiswas.isEmpty()) {
            Mahasiswa m = mahasiswas.get(0);
            m.belajar();
            m.belajar("Matematika");
            m.tampilData(true); // Overload tampilData
        }
    }

    static boolean validIndex(int idx, int size) { return idx >= 0 && idx < size; }

    static int readInt() {
        try { return Integer.parseInt(sc.nextLine().trim()); }
        catch (Exception e) { return -1; }
    }

    static String readLine() { return sc.nextLine().trim(); }
}