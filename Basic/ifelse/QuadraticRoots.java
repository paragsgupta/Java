// 1Roots of Quadratic Equation (Real, Imaginary, Complex)

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        double d = (b * b) - (4 * a * c);  // Discriminant

        if (d < 0) {
            System.out.println("Root are imaginary;");
            System.out.println("No solution.");
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal: " + root);
        } else {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real:");
            System.out.println("Root1 = " + r1);
            System.out.println("Root2 = " + r2);
        }

        sc.close();
    }
}
