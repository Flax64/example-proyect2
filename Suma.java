public class Suma {
    private int numero1;
    private int numero2;

    public void Suma() {
        this.numero1 = 0;
        this.numero2 = 0;
    }
    public void Suma(int a, int b) {
        this.numero1 = a;
        this.numero2 = b;
    }

    public int sumar(int a, int b) {
        return a + b;
    }
}