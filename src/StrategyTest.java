public class StrategyTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddStrategy());

        test("Addition", calculator.calculate(10, 5), 15);

        calculator.setStrategy(new SubtractStrategy());
        test("Subtraction", calculator.calculate(10, 5), 5);

        calculator.setStrategy(new MultiplyStrategy());
        test("Multiplication", calculator.calculate(10, 5), 50);

        calculator.setStrategy(new DivideStrategy());
        test("Division", calculator.calculate(10, 5), 2);

        try {
            calculator.calculate(10, 0);
            throw new RuntimeException("Division by zero test failed");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero passed");
        }

        System.out.println("All tests passed");
    }

    private static void test(String name, double result, double expected) {
        if (result != expected) {
            throw new RuntimeException(name + " test failed");
        }

        System.out.println(name + " passed");
    }
}