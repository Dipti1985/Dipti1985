package dec29;

import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args) {
        int row, i, j, space,num;
        System.out.println("Enter No Of Rows");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        for(i=0; i<row; i++)
        {
            for(space=row; space>i; space--)
            {
                System.out.print(" ");
            }
            num=1;
            for(j=0; j<=i; j++)
            {
                System.out.print(num+ " ");
                num = num*(i-j)/(j+1);

            }
            System.out.print("\n");
        }
    }
}
