//**  JAVAS PRIMER EJERCICIO PRIMARIOS

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario cuántos números quiere generar
        System.out.print("¿Cuántos números de la serie Fibonacci deseas ver? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, ingresa un número mayor que cero.");
        } else {
            int a = 0, b = 1;

            System.out.println("Los primeros " + n + " números de la serie Fibonacci son:");
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int siguiente = a + b;
                a = b;
                b = siguiente;
            }
        }

        scanner.close();
    }
}

        
