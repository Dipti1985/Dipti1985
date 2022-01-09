package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class b11 {
    public static void main(String[] args) {
        int [] arr = {90,40,60,30,100};
        String [] arr1={"deep","tops","rami","ami","nilam"};

        System.out.println("Orignal Array:- " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("sorted Array" + Arrays.toString(arr));

        System.out.println("orignal Array" + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("sorted Array" + Arrays.toString(arr1));

    }
}
