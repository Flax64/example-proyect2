import java.util.*;
public class Calculadora 
{
    public static void main (String [] args) 
    {
        Scanner teclado = new Scanner(System.in);
        Operacion op = new Operacion();

        do { 
            System.out.println("0: Salir" +
                            "\n1: Sumar" +
                            "\n2: Restar" +
                            "\n3: Multiplicar" +
                            "\n4: Dividir"
            );
            opcion = teclado.nextInt();
            if (opcion == 0) {
                System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
                break;
            }
            
            System.out.println("Ingrese el primer numero: ");
            op.setNumero1(teclado.nextInt());
            System.out.println("Ingrese el segundo numero: ");
            b = teclado.nextInt();
            switch (opcion) {
                case 1:
                    Suma suma = new Suma();
                    System.out.println("La suma es: " + (suma.sumar(a, b)));
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
        } while (opcion > 0 && opcion < 5);
    }
}