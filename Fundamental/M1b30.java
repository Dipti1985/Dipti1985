package Fundamental;
// W A Java Prg to print numbers between 1 to 100 which are divisible by 3,5, and by both.

public class M1b30 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\nDivisible By 3 : ");
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0)

                System.out.print(i + " ");
        }
        System.out.println("\nDivisible By 5 : ");
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0)

                System.out.print(i + " ");


        }

    }
}
