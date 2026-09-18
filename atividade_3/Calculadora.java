public class Calculadora {
    int somar(int a, int b) {
        return a + b;
    }

    double somar(double a, double b) {
        return a + b;
    }

    int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("somar(2, 3) = " + calc.somar(2, 3));
        System.out.println("somar(2.5, 3.5) = " + calc.somar(2.5, 3.5));
        System.out.println("somar(1, 2, 3) = " + calc.somar(1, 2, 3));
    }
}
