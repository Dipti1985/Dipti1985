package dec29;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int i,j,k;
        System.out.println("enter No Of Rows: -");
        Scanner sc =new Scanner(System.in);
        i = sc.nextInt();
        for(j=1;j<=i;j++)
        {
            for(k=1;k<=j;k++)
                System.out.print(k);
            System.out.println("");
        }


    }
}
