/*
24. Write a program in Java to read any Month Number in integer and display the number of days for this month. 
Test Data :
7
Expected Output :
Month have 31 days
*/

import java.util.Scanner;

public class DisplayNumberOfDaysInMonth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 ||
            month == 8 || month == 10 || month == 12) {
            System.out.println("Month have 31 days");
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Month have 30 days");
        }
        else if (month == 2) {
            System.out.println("Month have 28 or 29 days");
        }
        else {
            System.out.println("Invalid month number!");
        }
    }
}
