package dec28;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int i,n=0;
        int sum;
      float a;

        sum=0;
        System.out.println("Enter 5 Numbers:-");
        for(i=0;i<5;i++) {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            sum += n;
        }
        a=sum/5;
        System.out.println("Sum is " + sum);
        System.out.println("Avrage is " + a);



    }
}
