import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Congratulation! You are eligible for casting your vote.");
        } else {
            System.out.println("You are not eligible for casting your vote.");
        }

        sc.close();
    }
}
