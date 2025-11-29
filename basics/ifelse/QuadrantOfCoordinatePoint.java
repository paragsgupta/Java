// QuadrantOfCoordinatePoint


import java.util.Scanner;

public class QuadrantOfCoordinatePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter Y coordinate: ");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the First quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The coordinate point lies in the Second quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The coordinate point lies in the Third quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("The coordinate point lies in the Fourth quadrant.");
        } else {
            System.out.println("The point lies on an axis.");
        }

        sc.close();
    }
}
