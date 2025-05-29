//** el usuario es positivo

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el inicio del rango
        System.out.print("Ingresa el número de inicio del rango (positivo): ");
        int inicio = scanner.nextInt();

        // Solicitar el fin del rango
        System.out.print("Ingresa el número final del rango (positivo): ");
        int fin = scanner.nextInt();

        // Verificar que los números sean positivos y que el rango sea válido
        if (inicio < 0 || fin < 0 || inicio > fin) {
            System.out.println("Error: Asegúrate de que ambos números sean positivos y que el inicio sea menor o igual que el fin.");
        } else {
            System.out.println("Números pares en el rango de " + inicio + " a " + fin + ":");

            // Bucle for para imprimir los pares
            for (int i = inicio; i <= fin; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
