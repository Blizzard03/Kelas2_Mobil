/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelas2_mobil.Kelas2_Mobil.Mobil;

/**
 *
 * @author mariq
 */
public class Mobil {

    private String mobil;
    private int tarif;
    private int keluaran;

    public Mobil() {
        this.mobil = "";
        this.tarif = 0;
        this.keluaran = 0;
    }

    public Mobil(String mobil) {
        this.mobil = mobil;
        this.tarif = 0;
        this.keluaran = 0;
    }

    public Mobil(String mobil, int tarif) {
        this.mobil = mobil;
        this.tarif = tarif;
        this.keluaran = 0;
    }

    public Mobil(String mobil, int tarif, int keluaran) {
        this.mobil = mobil;
        this.tarif = tarif;
        this.keluaran = keluaran;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public void setKeluaran(int keluaran) {
        this.keluaran = keluaran;
    }

    public String getMobil() {
        return mobil;
    }

    public int getTarif() {
        return tarif;
    }

    public int getKeluaran() {
        return keluaran;
    }
}
