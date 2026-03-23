public class Operacion {
    private int numero1;
    private int numero2;
    private int resultado;
    private int operador;
    
    public void Operacion(){
        this.numero1 = 0;
        this.numero2 = 0;
        this.resultado = 0;
        this.operador = 0;
    }

    public int getNumero1() {
        return numero1;
    }
    public int getNumero2() {
        return numero2;
    }
    public int getOperador() {
        return operador;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public void setOperador(int operador) {
        this.operador = operador;
    }

    public int calcular(){
        switch (operador) {
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
                    resultado = 0; // o algún valor que indique error
                }
                break;
            default:
                System.out.println("Operador no válido.");
                resultado = 0; // o algún valor que indique error
        }
        return resultado;
    }

}
