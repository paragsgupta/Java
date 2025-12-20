import java.util.Scanner;

public class CheckNumberNegativePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check positive, negative, or zero
        if (num > 0) {
            System.out.println(num + " is a positive number");
        } else if (num < 0) {
            System.out.println(num + " is a negative number");
        } else {
            System.out.println("The number is zero");
        }

        sc.close();
    }
}
