import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Java Calculator");
        System.out.println("Type the first number: ");
        double number1 = sc.nextDouble();
        if (number1 > 0) {
            sc.nextLine();

            System.out.println("Type a operator (+, -, *, /): ");
            char operator = sc.next().charAt(0); // Reads the first symbol typed by the user
            sc.nextLine();

            System.out.println("Type the second number: ");
            double number2 = sc.nextDouble();
            sc.nextLine();

            double result = 0;
            boolean isValid = true;

            switch (operator) {
                case '+':
                    result = number1 + number2;
                    break;

                case '-':
                    result = number1 - number2;
                    break;

                case '*':
                    result = number1 * number2;
                    break;

                case '/':
                    try {
                        if (number2 != 0) {
                            result = number1 / number2;
                        } else {
                            System.out.println("Can't divide by zero!");
                        }
                    } catch (ArithmeticException e) {
                        System.out.println("ArithmeticException occurred: " + e.getMessage());
                    }
                    break;

                // Handles the input mismatch for operators
                default:
                    System.out.println("Error: Invalid Operator!");
                    isValid = false;
                    break;
            }
            if (isValid == true) {
                System.out.println("Result: " + result);
            }
        }
        else {
            System.out.println("Type a valid number!");
        }
    }
}

