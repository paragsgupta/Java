import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the Roll Number of the student: ");
        int roll = sc.nextInt();

        System.out.print("Input marks of Physics, Chemistry and Computer Application: ");
        int p = sc.nextInt();
        int c = sc.nextInt();
        int ca = sc.nextInt();

        int total = p + c + ca;
        double percentage = total / 3.0;

        String division;
        if (percentage >= 60) division = "First";
        else if (percentage >= 45) division = "Second";
        else if (percentage >= 33) division = "Third";
        else division = "Fail";

        System.out.println("Roll No : " + roll);
        System.out.println("Marks in Physics : " + p);
        System.out.println("Marks in Chemistry : " + c);
        System.out.println("Marks in Computer Application : " + ca);
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + String.format("%.2f", percentage));
        System.out.println("Division = " + division);

        sc.close();
    }
}
