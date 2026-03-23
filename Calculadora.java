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
            op.setOperador(teclado.nextInt());
            if (op.getOperador() == 0) {
                System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
                break;
            }
            
            
            System.out.println("Ingrese el primer numero: ");
            op.setNumero1(teclado.nextInt());
            System.out.println("Ingrese el segundo numero: ");
            op.setNumero2(teclado.nextInt());
            
            System.out.println("El resultado es: " + op.calcular());
        } while (op.getOperador() != 0);
    }
}