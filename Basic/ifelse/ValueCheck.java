import java.util.Scanner;

public class ValueCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of m: ");
        int m = sc.nextInt();

        int n;

        if (m > 0) {
            n = 1;
        } else if (m == 0) {
            n = 0;
        } else {
            n = -1;
        }

        System.out.println("The value of n = " + n);
        sc.close();
    }
}
