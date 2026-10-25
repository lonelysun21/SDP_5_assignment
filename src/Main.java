import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, OperationStrategy> strategies = Map.of(
                "1", new AddStrategy(),
                "2", new SubtractStrategy(),
                "3", new MultiplyStrategy(),
                "4", new DivideStrategy()
        );

        Calculator calculator = new Calculator(new AddStrategy());

        while (true) {
            System.out.println("\nCalculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.print("Choose operation: ");

            String choice = scanner.nextLine();

            if (choice.equals("0")) {
                break;
            }

            OperationStrategy strategy = strategies.get(choice);

            if (strategy == null) {
                System.out.println("Invalid operation");
                continue;
            }

            try {
                System.out.print("First number: ");
                double a = Double.parseDouble(scanner.nextLine());

                System.out.print("Second number: ");
                double b = Double.parseDouble(scanner.nextLine());

                calculator.setStrategy(strategy);

                double result = calculator.calculate(a, b);
                System.out.println("Result: " + result);

            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}