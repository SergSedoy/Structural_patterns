package adapter;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(10, 10));
        System.out.println(calc.mult(10, 10));
        System.out.println(calc.pow(5, 2));
    }
}
