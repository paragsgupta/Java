import java.util.Scanner;

public class AdmissionEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the marks obtained in Physics : ");
        int phy = sc.nextInt();

        System.out.print("Input the marks obtained in Chemistry : ");
        int chem = sc.nextInt();

        System.out.print("Input the marks obtained in Mathematics : ");
        int math = sc.nextInt();

        int total = phy + chem + math;
        int mpTotal = math + phy;

        if (math >= 65 && phy >= 55 && chem >= 50 &&
                (total >= 170 || mpTotal >= 140)) {

            System.out.println("The candidate is eligible for admission.");
        } else {
            System.out.println("The candidate is not eligible for admission.");
        }

        sc.close();
    }
}
