package OOPs;
import java.util.Scanner;
public class Triangle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first side: ");
        double a = in.nextDouble();
        System.out.print("Enter second side: ");
        double b = in.nextDouble();
        System.out.print("Enter third side: ");
        double c = in.nextDouble();

        double perimeter = a + b + c;
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}
