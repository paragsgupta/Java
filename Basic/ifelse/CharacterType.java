// 16. Check Alphabet, Digit or Special Character

import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isAlphabetic(ch)) {
            System.out.println("This is an alphabet.");
        } else if (Character.isDigit(ch)) {
            System.out.println("This is a digit.");
        } else {
            System.out.println("This is a special character.");
        }

        sc.close();
    }
}
