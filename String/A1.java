package String;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        System.out.println("Enter Strung:-");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        //String str1 = "Tops Technology";
        //System.out.println("The given string is: " + str1);
        for (int i = 0; i < str1.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str1.length(); j++) {
                if (i != j && str1.charAt(i) == str1.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("The first non repeated character in String is: " + str1.charAt(i));
                break;
            }
        }
    }
}
