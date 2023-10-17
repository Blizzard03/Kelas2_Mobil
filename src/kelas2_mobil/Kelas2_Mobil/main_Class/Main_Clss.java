/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kelas2_mobil.Kelas2_Mobil.main_Class;

import kelas2_mobil.Kelas2_Mobil.Mobil.Mobil;

/**
 *
 * @author mariq
 */
public class Main_Clss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil mobil1 = new Mobil(); // Konstruktor tanpa parameter
        Mobil mobil2 = new Mobil("Sedan"); // Konstruktor dengan parameter mobil
        Mobil mobil3 = new Mobil("SUV", 150000); // Konstruktor dengan parameter mobil dan tarif
        Mobil mobil4 = new Mobil("Minivan", 120000, 2020); // Konstruktor dengan parameter mobil, tarif, dan keluaran

        // Menampilkan informasi mobil
        System.out.println("Mobil 1:");
        System.out.println("Jenis Mobil: " + mobil1.getMobil());
        System.out.println("Tarif: " + mobil1.getTarif());
        System.out.println("Keluaran: " + mobil1.getKeluaran());

        System.out.println("\nMobil 2:");
        System.out.println("Jenis Mobil: " + mobil2.getMobil());
        System.out.println("Tarif: " + mobil2.getTarif());
        System.out.println("Keluaran: " + mobil2.getKeluaran());

        System.out.println("\nMobil 3:");
        System.out.println("Jenis Mobil: " + mobil3.getMobil());
        System.out.println("Tarif: " + mobil3.getTarif());
        System.out.println("Keluaran: " + mobil3.getKeluaran());

        System.out.println("\nMobil 4:");
        System.out.println("Jenis Mobil: " + mobil4.getMobil());
        System.out.println("Tarif: " + mobil4.getTarif());
        System.out.println("Keluaran: " + mobil4.getKeluaran());
    }

}
