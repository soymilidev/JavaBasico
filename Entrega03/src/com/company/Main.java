//En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
//Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
//String[] nombres = {"", "", "", ""}

package com.company;

public class Main {
    public static void main(String[] args) {

        String texto = "";
        String[] paises = {"Argentina", " Bolivia", " Brasil"};
        for (int  i=0; i < paises.length; i++){
            texto += paises[i];
        }
        System.out.println(texto);
    }
}