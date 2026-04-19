package com.posttest4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Kendaraan> list = new ArrayList<>();

        Mobil m1 = new Mobil("Toyota", "KT1234AA", "Bridgestone", "Hitam");
        Motor m2 = new Motor("Honda", "KT5678BB", "Budi");
        Sepeda s1 = new Sepeda("Polygon", "-", "Gunung");

        list.add(m1);
        list.add(m2);
        list.add(s1);

        // DEMO
        for (Kendaraan k : list) {
            k.info();
            k.servis();
            System.out.println();
        }

        // Interface demo
        m1.tambahData();
        m2.tambahData();
        s1.hapusData();
    }
}