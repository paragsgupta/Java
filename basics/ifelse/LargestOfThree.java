import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("\n1st Number = " + a + ",2nd Number = " + b + "\n,3rd Number = " + c);
        System.out.println("The " + largest + " is the greatest among three");

        sc.close();
    }
}
