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
        Mobil mobil5 = new Mobil("Mitsubitsi Lancer Evo X", 150000, 2016);
        Mobil mobil6 = new Mobil("Suzuki Karimun Wagon", 250000, 2023);
        Mobil mobil7 = new Mobil("Toyora Starlet Starko GT Turbo", 175000, 1998);

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
        System.out.println("Umur Mobil: " + Mobil.hitung_tahun(mobil4.getKeluaran()) + " " + "Tahun");
        System.out.println("\nMobil 5:");
        System.out.println("Jenis Mobil: " + mobil5.getMobil());
        System.out.println("Tarif: " + mobil5.getTarif());
        System.out.println("Keluaran: " + mobil5.getKeluaran());
        System.out.println("Umur Mobil: " + Mobil.hitung_tahun(mobil5.getKeluaran()) + " " + "Tahun");
        System.out.println("\nMobil 6:");
        System.out.println("Jenis Mobil: " + mobil6.getMobil());
        System.out.println("Tarif: " + mobil6.getTarif());
        System.out.println("Keluaran: " + mobil6.getKeluaran());
        System.out.println("Umur Mobil: " + Mobil.hitung_tahun(mobil6.getKeluaran()) + " " + "Tahun");
        System.out.println("\nMobil 7:");
        System.out.println("Jenis Mobil: " + mobil7.getMobil());
        System.out.println("Tarif: " + mobil7.getTarif());
        System.out.println("Keluaran: " + mobil7.getKeluaran());
        System.out.println("Umur Mobil: " + Mobil.hitung_tahun(mobil7.getKeluaran()) + " " + "Tahun");

        int[] usia = {
            Mobil.hitung_tahun(mobil7.getKeluaran())+
            Mobil.hitung_tahun(mobil4.getKeluaran())
            + Mobil.hitung_tahun(mobil5.getKeluaran())
            + Mobil.hitung_tahun(mobil6.getKeluaran())
            
        };
        int mobillkurangdari10tahun = usia[0];
        int mobillebihdari10tahun = usia[0];
        for(int i = 0; i<usia.length;i++){
            if(usia[i]>=10){
                mobillebihdari10tahun = usia[i];
            }else if(usia[i]<10){
                mobillebihdari10tahun = usia[i];
            }
        }
        System.out.println("Mobil berumur < 10 tahun" + " " + Math.abs(mobillkurangdari10tahun) + " " + "mobil");
        System.out.println("Mobil berumur >= 10 tahun" + " " + Math.abs(mobillebihdari10tahun) + " " + "mobil");
    }

}
