// 20. Grade Description Program

/*
E → Excellent
V → Very Good
G → Good
A → Average
F → Fail
*/

import java.util.Scanner;

public class GradeDescription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the grade: ");
        char g = sc.next().toUpperCase().charAt(0);

        switch (g) {
            case 'E': System.out.println("You have chosen : Excellent"); break;
            case 'V': System.out.println("You have chosen : Very Good"); break;
            case 'G': System.out.println("You have chosen : Good"); break;
            case 'A': System.out.println("You have chosen : Average"); break;
            case 'F': System.out.println("You have chosen : Fail"); break;
            default:  System.out.println("Invalid grade.");
        }

        sc.close();
    }
}
