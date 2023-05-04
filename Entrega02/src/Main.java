//Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

public class Main {
    public static void main(String[] args) {
        double precio = 10.00;
        double iva = 21.00;
        double resultado = calcularPrecioMasIva(precio, iva);
        System.out.println("Precio con IVA: " + resultado);
    }

    public static double calcularPrecioMasIva(double precio, double iva) {
        //double resultado = precio + precio * iva/100;
        double resultado = precio * (1 + iva/100);
        return resultado;
    }
}