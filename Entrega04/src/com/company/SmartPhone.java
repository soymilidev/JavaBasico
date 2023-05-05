package com.company;

public class SmartPhone extends SmartDevice{
    boolean camara;

    public SmartPhone() {
    }
    public SmartPhone(String sistemaOperativo, String bateria, boolean wiFi, boolean pantalla, boolean camara) {
        super(sistemaOperativo, bateria, wiFi, pantalla);
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", bateria='" + bateria + '\'' +
                ", wiFi=" + wiFi +
                ", pantalla=" + pantalla +
                ", camara=" + camara +
                '}';
    }
}