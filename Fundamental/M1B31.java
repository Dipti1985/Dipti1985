package Fundamental;
// W A Java Prg to Calculate the sum of two integer and return true if the sum equal to a third integer

import java.util.Scanner;

public class M1B31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1St No" );

               int n1 = in.nextInt();
        System.out.print("Enter 2nd No" );
            int n2 = in.nextInt();
        System.out.print("Enter 3rd No" );
            int n3 = in.nextInt();
        System.out.println("Result is  " + sumoftwo( n1,n2,n3));
        System.out.println("\n");
    }
    public static boolean sumoftwo(int a,int b, int c)
    {
        return ((a + b )==c || (b + c)==a || (c + a )==b);

    }

}
