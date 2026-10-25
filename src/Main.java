public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddStrategy());

        System.out.println("Addition: " + calculator.calculate(10, 5));
    }
}