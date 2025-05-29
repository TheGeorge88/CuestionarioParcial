//** Java que solicite al usuario una cadena de texto 

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cadena al usuario
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();

        int contadorVocales = 0;

        // Recorrer cada carácter de la cadena
        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("La cantidad de vocales es: " + contadorVocales);

        scanner.close();
    }
}
