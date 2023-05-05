package com.company;

public class SmartWatch extends SmartDevice{
    boolean sensor;

    public SmartWatch() {
    }
    public SmartWatch(String sistemaOperativo, String bateria, boolean wiFi, boolean pantalla, boolean sensor) {
        super(sistemaOperativo, bateria, wiFi, pantalla);
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", bateria='" + bateria + '\'' +
                ", wiFi=" + wiFi +
                ", pantalla=" + pantalla +
                ", sensor=" + sensor +
                '}';
    }
}