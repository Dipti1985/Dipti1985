package Array;

import java.util.Arrays;

public class I2 {
    public static void main(String[] args) {
        int[] my_array = {10,43,56,22,56,66,21,50,78,86};
        int[] new_array = new int[10];

        System.out.println("Source Array : "+ Arrays.toString(my_array));

        for(int i=0; i < my_array.length; i++) {
            new_array[i] = my_array[i];
        }
        System.out.println("New Array: "+Arrays.toString(new_array));
    }
}
