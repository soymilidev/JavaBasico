package com.company;

public class SmartDevice {
    String sistemaOperativo;
    String bateria;
    boolean wiFi;
    boolean pantalla;

    public SmartDevice() {
    }

    public SmartDevice(String sistemaOperativo, String bateria, boolean wiFi, boolean pantalla) {
        this.sistemaOperativo = sistemaOperativo;
        this.bateria = bateria;
        this.wiFi = wiFi;
        this.pantalla = pantalla;
    }
}