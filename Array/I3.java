package Array;

public class I3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array" + array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");

        }
        System.out.println("Reverse Order");

        for (int i = array.length - 1; i >= 0; i--) {

            System.out.print(array[i] + " ");
        }
    }
}