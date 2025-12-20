

import java.util.Scanner;

public class Fahrenheit2Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        //Logic
        //(F-32)*5/9
        double celsius = (fahrenheit - 32) * 5 / 9;

        //Output
        System.out.println(fahrenheit + "F = " + celsius + "C");

        sc.close();
    }
}
