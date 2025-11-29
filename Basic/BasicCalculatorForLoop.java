import java.util.Scanner;

public class BasicCalculatorForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Loop runs 5 times (you can change 5 to any number)
        for(int i = 1; i <= 5; i++) {
            System.out.println("\n--- Calculator Run " + i + " ---");

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.println("Choose operation: +  -  *  /");
            char op = sc.next().charAt(0);

            double result = 0;

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if(num2 != 0)
                        result = num1 / num2;
                    else
                        System.out.println("Error: Division by zero not allowed!");
                    break;
                default:
                    System.out.println("Invalid operation!");
            }

            System.out.println("Result = " + result);
        }

        sc.close();
    }
}
