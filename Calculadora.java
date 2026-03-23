import java.util.*;
public class Calculadora 
{
    public static void main (String [] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int opcion, a, b;

        do { 
            System.out.println("0: Salir" +
                            "1: Sumar" +
                            "2: Restar" +
                            "3: Multiplicar" +
                            "4: Dividir"
            );
            opcion = teclado.nextInt();
            
            System.out.println("Ingrese el primer numero: ");
            a = teclado.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            b = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (a + b));
                    break;
                case 2:
                    System.out.println("La resta es: " + (a - b));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (a * b));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println("La división es: " + (a / b));
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;
            }
        } while (opcion != 0);
    }
}