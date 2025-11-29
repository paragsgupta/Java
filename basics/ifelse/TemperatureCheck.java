//13. Temperature Message Program

import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();

        if (temp < 0) {
            System.out.println("Freezing weather");
        } else if (temp <= 10) {
            System.out.println("Very Cold weather");
        } else if (temp <= 20) {
            System.out.println("Cold weather");
        } else if (temp <= 30) {
            System.out.println("Normal in Temp");
        } else if (temp <= 40) {
            System.out.println("Its Hot");
        } else {
            System.out.println("Its very hot.");
        }

        sc.close();
    }
}
