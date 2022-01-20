package Fundamental;
// W A Java Prg to accept two integer value between 25 to 75 and return true if there is a common digit in both numbers.


import java.util.Scanner;

public class M1B32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1St No" );
        int n1 = in.nextInt();
        System.out.print("Enter 2nd No" );
        int n2 = in.nextInt();
        System.out.println("Result is" +commondigit(n1, n2));
        System.out.println("\n");
    }
    public static boolean commondigit(int a,int b)
    {
        if (a<25 || b>75)
            return false;
        int x = a%10;
        int y = b%10;
        a/=10;
        b/=10;
        return (a==b || a==y || x==b || x==y);

    }
}
