/*
25. Write a program in Java which is a Menu-Driven Program to compute the area of the various geometrical shape. 
Test Data :
1
5
Expected Output :
The area is : 78.500000


*/

import java.util.Scanner;

public class MenuDrivenAreaCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Rectangle");
        System.out.println("3. Area of Triangle");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        double area = 0;

        switch(choice) {

            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                area = 3.14 * r * r;
                break;

            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double b = sc.nextDouble();
                area = l * b;
                break;

            case 3:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                area = 0.5 * base * h;
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.printf("The area is : %f", area);
    }
}
