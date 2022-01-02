package dec29;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        int row,i,j,c=1,b;
        System.out.print("Enter No of Rows");

        Scanner sc =new Scanner(System.in);
        row=sc.nextInt();

        for(i=0;i<row;i++)
        {
            for (b=1;b<=row-i;b++)
            {
                System.out.print(" ");
                for(j=0;j<=i;j++)
                {
                    if(j==0 || i==0)
                        c=1;
                    else
                        c=c*(i-j+1)/j;
                    System.out.print(" "+c);

                    }
                System.out.print("\n");
                }
            }

        }
    }

