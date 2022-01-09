package Array;

public class B13 {
    public static void main(String[] args) {
        int [] arry = {1,2,3,4,5,6,7,8,9,10,11,12};
        int lenth = arry.length;
        int sum=0;
        for(int i : arry)
            sum += i;


        double avg =sum / lenth;
        System.out.println(avg);

    }

}
