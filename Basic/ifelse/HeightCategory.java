import java.util.Scanner;

public class HeightCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        int h = sc.nextInt();

        if (h < 150) {
            System.out.println("The person is Dwarf.");
        } else if (h <= 180) {
            System.out.println("The person is Medium.");
        } else {
            System.out.println("The person is Tall.");
        }

        sc.close();
    }
}
