// Escribir un programa que solicite al usuario ingresar la cantidad de numeros que quiere
// comparar y luego pedir esa cantidad de numeros uno por uno.
// Mostrar cual es el mayor y cual es el menor.
import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadNums;

        System.out.println("¿Cuántos números quieres ingresar?");
        cantidadNums = scanner.nextInt();

        if (cantidadNums <= 0) {
            System.out.println("Debes ingresar una cantidad positiva.");
            return;
        }

        System.out.println("Ingresa el número 1:");
        int num = scanner.nextInt();
        int minValue = num;
        int maxValue = num;

        for (int i = 2; i <= cantidadNums; i++) {
            System.out.println("Ingresa el número " + i + ":");
            num = scanner.nextInt();

            if (num < minValue) {
                minValue = num;
            }
            if (num > maxValue) {
                maxValue = num;
            }
        }

        System.out.println("El número mayor es: " + maxValue);
        System.out.println("El número menor es: " + minValue);
    }
}
