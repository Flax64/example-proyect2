public class Operacion {
    private int numero1;
    private int numero2;
    private int resultado;
    private int opcion;

    public void opreacion (int a, int b) {
        this.numero1 = a;
        this.numero2 = b;
        this.resultado = 0;
        this.opcion = 0;
    }

    public int getOpcion() {
        return opcion;
    }
    public int getNumero1() {
        return numero1;
    }
    public int getNumero2() {
        return numero2;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int calcularResultado() {
        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error: División por cero no permitida.");
                    resultado = 0; // O algún valor que indique error
                }
                break;
            default:
                System.out.println("Opción no válida.");
                resultado = 0; // O algún valor que indique error
        }
        return resultado;
    }
}
