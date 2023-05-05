//En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
//Agregaréis atributos tal cual tendrían esos objetos en la realidad.
//Crear constructor vacío y con todos los parámetros para cada clase.
//Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.


package com.company;

public class Main {
    public static void main(String[] args) {

        SmartDevice SmartPhone1 = new SmartPhone("Android", "100%", true, true, true);
        SmartDevice SmartWatch1 = new SmartWatch("watchOS", "100%", true, true, true);

        System.out.println(SmartPhone1);
        System.out.println(SmartWatch1);
    }
}