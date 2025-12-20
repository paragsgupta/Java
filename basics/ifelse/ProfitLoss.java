// Profit or Loss calculation

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        int cp = sc.nextInt();

        System.out.print("Enter Selling Price: ");
        int sp = sc.nextInt();

        if (sp > cp) {
            System.out.println("You can booked your profit amount : " + (sp - cp));
        } else if (cp > sp) {
            System.out.println("You incurred a loss amount : " + (cp - sp));
        } else {
            System.out.println("No profit no loss.");
        }

        sc.close();
    }
}

