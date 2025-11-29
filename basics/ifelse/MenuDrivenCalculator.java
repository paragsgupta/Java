/*
26. Write a program in Java which is a Menu-Driven Program to perform a simple calculation. 
Test Data :
10
2
3
Expected Output :
The Multiplication of 10 and 2 is: 20

*/


import java.util.Scanner;

public class MenuDrivenCalculator{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                System.out.println("The Addition of " + a + " and " + b + " is: " + (a + b));
                break;

            case 2:
                System.out.println("The Subtraction of " + a + " and " + b + " is: " + (a - b));
                break;

            case 3:
                System.out.println("The Multiplication of " + a + " and " + b + " is: " + (a * b));
                break;

            case 4:
                if (b == 0)
                    System.out.println("Cannot divide by zero!");
                else
                    System.out.println("The Division of " + a + " and " + b + " is: " + (a / b));
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
