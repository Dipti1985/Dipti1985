package dec31;

import java.util.Scanner;

public class CountInputNoLetter {
    public static void main(String[] args) {
        String data;
        System.out.println("Enter THe String:-");
        Scanner sc = new Scanner(System.in);
        data = sc.nextLine();
        count(data);

    }

    public static void count(String x) {
        char[] ch = x.toCharArray();
        int l = 0;
        int s = 0;
        int n = 0;
        int o = 0;
        for (int i = 0; i <=x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                l++;
            } else if (Character.isDigit(ch[i])) {
                n++;
            } else if (Character.isSpaceChar(ch[i])) {

                s++;
            } else {

                o++;

            }
            System.out.println(x);
            System.out.println("Letter" + l);
            System.out.println("Space" + s);
            System.out.println("Number" + n);
            System.out.println("Other" + o);
        }


    }
}
