package com.company;

public class Araba {
    public Araba(String renk, int kapilar, int tekerlekler, String model, String motor) {
        this.renk = renk;
        this.kapilar = kapilar;
        this.tekerlekler = tekerlekler;
        this.model = model;
        this.motor = motor;
    }

    public Araba() {

    }


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapilar() {
        return kapilar;
    }

    public void setKapilar(int kapilar) {
        this.kapilar = kapilar;
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String model;
    private String motor;
}
