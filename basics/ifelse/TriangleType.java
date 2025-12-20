import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides of triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("This is an equilateral triangle.");
        } else if (a == b || b == c || a == c) {
            System.out.println("This is an isosceles triangle.");
        } else {
            System.out.println("This is a scalene triangle.");
        }

        sc.close();
    }
}
