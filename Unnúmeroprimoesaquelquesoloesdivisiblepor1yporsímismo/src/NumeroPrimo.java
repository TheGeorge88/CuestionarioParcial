//** Un número primo es aquel que solo es divisible por 1 y por sí mismo

import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " no es un número primo.");
        } else {
            boolean esPrimo = true;

            // Revisar divisores desde 2 hasta la raíz cuadrada del número
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        }

        scanner.close();
    }
}

