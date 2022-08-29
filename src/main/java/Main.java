public class Main {
    public static void main(String[] args) {
        IntsCalculator calculator = new IntsCalculator();

        int a = 5;
        int b = 15;

        int result = calculator.sum(a, b);
        System.out.println("5 + 15 = " + result);
        result = calculator.mult(a, b);
        System.out.println("5 * 15 = " + result);
        result = calculator.pow(a, b);
        System.out.println("5 ^ 15 = " + result);
    }
}
