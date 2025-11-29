// 19. Electricity Bill Calculation

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Customer ID NO : ");
        int id = sc.nextInt();

        System.out.print("Unit Consumed : ");
        int unit = sc.nextInt();

        double charge;

        if (unit < 200) {
            charge = unit * 3.20;
        } else if (unit < 400) {
            charge = unit * 5.50;
        } else if (unit < 600) {
            charge = unit * 8.80;
        } else {
            charge = unit * 9.00;
        }

        double surcharge = 0;

        if (charge > 1000) {
            surcharge = charge * 0.15;
        }

        double net = charge + surcharge;

        if (net < 200) {
            net = 200;
        }

        System.out.println("Amount Charges : " + String.format("%.2f", charge));
        System.out.println("Surcharge Amount : " + String.format("%.2f", surcharge));
        System.out.println("Net Amount Paid By the Customer : " + String.format("%.2f", net));

        sc.close();
    }
}
