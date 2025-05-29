//** IngresadoPorElUsuarioEsPositivoNegativo

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir número al usuario
        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();

        // Evaluar el número
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es igual a cero.");
        }

        scanner.close();
    }
}
