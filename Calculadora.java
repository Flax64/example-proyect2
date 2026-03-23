import java.util.*;
public class Calculadora 
{
    public static void main (String [] args) 
    {
        Scanner teclado = new Scanner(System.in);
       Operacion operacion = new Operacion();

        do { 
            System.out.println("0: Salir" +
                            "1: Sumar" +
                            "2: Restar" +
                            "3: Multiplicar" +
                            "4: Dividir"
            );
            operacion.setOpcion(teclado.nextInt());
            System.out.println("Ingrese el primer numero: ");
            operacion.setNumero1(teclado.nextInt());
            System.out.println("Ingrese el segundo numero: ");
            operacion.setNumero2(teclado.nextInt());
            operacion.calcularResultado();
        } while (operacion.getOpcion() != 0);
    }
}