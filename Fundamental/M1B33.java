package Fundamental;

public class M1B33 {
    public static void main(String[] args) {
        int count, sum = 0;
        for (int n = 1; n <= 100; n++) {
            count = 0;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0 && n != 1) {
                sum = sum + n;

            }

        }
        System.out.println("sum is " + sum);

    }
}
