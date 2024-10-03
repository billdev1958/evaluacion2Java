import java.util.Random;
import java.util.Scanner;

// Programa de adivinanza de numeros del 1 al 10 con solo 4 intentos

public class Practica1 {
    public static void main(String[] args) {
        System.out.println("Adivina un número del 1 al 10");

        Random rand = new Random();
        int a = rand.nextInt(10) + 1; // Número aleatorio entre 1 y 10
        int intentos = 0;
        int maxIntentos = 4;
        Scanner scanner = new Scanner(System.in);

        while (intentos < maxIntentos) {
            System.out.println("Ingresa un número:");
            int n = scanner.nextInt();

            intentos++;

            if (n > a) {
                System.out.println("El número ingresado es mayor");
            } else if (n < a) {
                System.out.println("El número ingresado es menor");
            } else {
                System.out.println("¡Felicidades, acertaste!");
                return; // Termina el juego si acierta
            }

            if (intentos == maxIntentos) {
                System.out.printf("Fallaste, el número era %d. Gracias por intentarlo.\n", a);
            }
        }

        scanner.close(); // Cierra el scanner
    }
}
