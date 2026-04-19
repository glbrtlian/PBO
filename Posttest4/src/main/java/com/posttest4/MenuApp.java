package com.posttest4;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuApp {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<Mobil> mobils = new ArrayList<>();
    static ArrayList<Motor> motors = new ArrayList<>();
    static ArrayList<Sepeda> sepedas = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("3. Sepeda");
            System.out.println("4. Tampilkan Semua");
            System.out.println("0. Exit");
            System.out.print("Pilih: ");

            int pilih = Integer.parseInt(sc.nextLine());

            switch (pilih) {
                case 1: menuMobil(); break;
                case 2: menuMotor(); break;
                case 3: menuSepeda(); break;
                case 4: tampilSemua(); break;
                case 0: return;
                default: System.out.println("Pilihan salah");
            }
        }
    }

    // ================== MOBIL ==================
    static void menuMobil() {
        while (true) {
            System.out.println("\n-- MENU MOBIL --");
            System.out.println("1. Tambah");
            System.out.println("2. Lihat");
            System.out.println("3. Update");
            System.out.println("4. Hapus");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");

            int p = Integer.parseInt(sc.nextLine());

            switch (p) {
                case 1:
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Plat: ");
                    String plat = sc.nextLine();
                    System.out.print("Ban: ");
                    String ban = sc.nextLine();
                    System.out.print("Warna: ");
                    String warna = sc.nextLine();

                    Mobil m = new Mobil(merk, plat, ban, warna);
                    mobils.add(m);
                    m.tambahData(); // interface
                    break;

                case 2:
                    if (mobils.isEmpty()) System.out.println("Kosong");
                    else {
                        for (int i = 0; i < mobils.size(); i++) {
                            System.out.print((i+1) + ". ");
                            mobils.get(i).info();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Index: ");
                    int i = Integer.parseInt(sc.nextLine()) - 1;
                    if (i >= 0 && i < mobils.size()) {
                        Mobil mm = mobils.get(i);
                        System.out.print("Merk baru: ");
                        mm.setMerk(sc.nextLine());
                        System.out.print("Plat baru: ");
                        mm.setPlatNomor(sc.nextLine());
                        System.out.println("Berhasil update");
                    }
                    break;

                case 4:
                    System.out.print("Index: ");
                    int h = Integer.parseInt(sc.nextLine()) - 1;
                    if (h >= 0 && h < mobils.size()) {
                        mobils.get(h).hapusData();
                        mobils.remove(h);
                    }
                    break;

                case 0: return;
            }
        }
    }

    // ================== MOTOR ==================
    static void menuMotor() {
        while (true) {
            System.out.println("\n-- MENU MOTOR --");
            System.out.println("1. Tambah");
            System.out.println("2. Lihat");
            System.out.println("3. Hapus");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");

            int p = Integer.parseInt(sc.nextLine());

            switch (p) {
                case 1:
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Plat: ");
                    String plat = sc.nextLine();
                    System.out.print("Pemilik: ");
                    String pemilik = sc.nextLine();

                    Motor m = new Motor(merk, plat, pemilik);
                    motors.add(m);
                    m.tambahData();
                    break;

                case 2:
                    for (int i = 0; i < motors.size(); i++) {
                        System.out.print((i+1) + ". ");
                        motors.get(i).info();
                    }
                    break;

                case 3:
                    System.out.print("Index: ");
                    int h = Integer.parseInt(sc.nextLine()) - 1;
                    if (h >= 0 && h < motors.size()) {
                        motors.get(h).hapusData();
                        motors.remove(h);
                    }
                    break;

                case 0: return;
            }
        }
    }

    // ================== SEPEDA ==================
    static void menuSepeda() {
        while (true) {
            System.out.println("\n-- MENU SEPEDA --");
            System.out.println("1. Tambah");
            System.out.println("2. Lihat");
            System.out.println("3. Hapus");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");

            int p = Integer.parseInt(sc.nextLine());

            switch (p) {
                case 1:
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Plat: ");
                    String plat = sc.nextLine();
                    System.out.print("Jenis: ");
                    String jenis = sc.nextLine();

                    Sepeda s = new Sepeda(merk, plat, jenis);
                    sepedas.add(s);
                    s.tambahData();
                    break;

                case 2:
                    for (int i = 0; i < sepedas.size(); i++) {
                        System.out.print((i+1) + ". ");
                        sepedas.get(i).info();
                    }
                    break;

                case 3:
                    System.out.print("Index: ");
                    int h = Integer.parseInt(sc.nextLine()) - 1;
                    if (h >= 0 && h < sepedas.size()) {
                        sepedas.get(h).hapusData();
                        sepedas.remove(h);
                    }
                    break;

                case 0: return;
            }
        }
    }

    // ================== TAMPIL SEMUA ==================
    static void tampilSemua() {
        System.out.println("\n=== SEMUA DATA ===");

        System.out.println("Mobil:");
        for (Mobil m : mobils) m.info();

        System.out.println("\nMotor:");
        for (Motor m : motors) m.info();

        System.out.println("\nSepeda:");
        for (Sepeda s : sepedas) s.info();
    }
}