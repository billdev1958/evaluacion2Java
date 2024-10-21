
import java.util.Scanner;



// Clase y constructor de el tamaño y suma para el promedio de edades
 class Values {
    int size;
    int suma;

    public Values (int size, int suma){
        this.size = size;
        this.suma = suma;
    }
}

public class Practica9 {
    
    // Obtiene el tamaño y suma de un array
     Values getValues(int[] calificaciones){
        int suma = 0;
        int size = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
            size++;
        }
        return new Values(size, suma);
    }

    // Obtiene el promedio de edades con el total de valores y la suma que se obtiene de getValues
    float calcularPromedio(int totalValores, int suma) {
        return (float) suma / totalValores;
    };
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de calificaciones: ");

        int n = scanner.nextInt();
        int edades[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Ingresa la calificacion" + (i +1)+":");

            edades[i] = scanner.nextInt();
        }

        Practica9 practica9 = new Practica9();
        // int[] calificaciones = {90, 85, 78, 92};
        Values resultado = practica9.getValues(edades);

        System.out.println("Tamaño: " + resultado.size);
        System.out.println("Suma: " + resultado.suma);

        float promedio = practica9.calcularPromedio(resultado.size, resultado.suma);

            System.out.println("Promedio: " + promedio);

    }
}