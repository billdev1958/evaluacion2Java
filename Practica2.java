// Escribe un programa que pida 2 numeros enteros y muestre todos los numeros pares e impares
// entre esos 2 numeros digitados. Utilizar for e if 
// Mostrar tambien la suma de los pares e impares
// Mostrar cuantos fueron pares y cuantos impares
import java.util.Scanner;

public class Practica2{

   public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa el primer numero");
    int num1 = scanner.nextInt();

    System.out.println("Ingresa el segundo numero");
    int num2 = scanner.nextInt();
    int numPar=0;
    int numImpar = 0;


    for (int i = num1; i <= num2; i++){

        if(i % 2 == 0){
            System.out.println(i + " :es par");
            numPar++;
        }else{
            System.out.println(i + " :es impar");
            numImpar++;
        }
        
    }

    System.out.println("Total de números pares: " + numPar);
    
    System.out.println("Total de números impares: " + numImpar);


}

}