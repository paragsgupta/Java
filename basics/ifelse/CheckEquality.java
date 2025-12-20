import java.util.Scanner;

public class CheckEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Logic and Output
        if (num1 == num2) {
            System.out.println("Number1 and Number2 are equal");
        } else {
            System.out.println("Number1 and Number2 are not equal");
        }

        sc.close();
    }
}
