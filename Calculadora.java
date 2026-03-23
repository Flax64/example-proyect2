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
            
        } while (opcion != 0);
    }
}