package OOPs;
import java.util.Scanner;

public class AreaBoth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AreaBoth enter = new AreaBoth();
        System.out.print("Enter the   length of the rectangle: ");
        System.out.print("Enter the breadth of the rectangle: ");
        int side;
        side = input.nextInt();
        int length;
        int breadth;
        length = input.nextInt();
        breadth = input.nextInt();
        System.out.print("Enter the side of the square: ");
        System.out.println("The area of the rectangle is " + area(length, breadth));
        System.out.println("The area of the square is" + area(side, breadth));
    }
    public static int area(int i, int breadth) {
        int s = 0;
        int area=s*s;
        return (area);
    }
}
