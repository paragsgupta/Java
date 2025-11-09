import java.util.Scanner;

public class MultiplyUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2, num3, result;

        System.out.print("Enter the value of number 1: ");
        num1= sc.nextInt();

        System.out.print("Enter the value of number 2: ");
        num2= sc.nextInt();

        System.out.print("Enter the value of number 3: ");
        num3= sc.nextInt();

        result = num1*num2*num3;
        System.out.println(" The value of " + num1+ " * "+num2+ " * "+num3+  " is " + result);


    }
    
}
