package Array;

public class B14 {
    public static boolean contains(int num[], int item ) {
        for(int n:num) {
            if(item==n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num[] = {1452,6589,-8975,1001,-1201,456,-6589};
        System.out.println(contains(num, 1001));
        System.out.println(contains(num, 456));
        System.out.println(contains(num, 789));
    }
}
