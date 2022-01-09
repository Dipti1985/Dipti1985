package Array;
// Find index of arrays elements.

public class B15 {

    public static int findIndex(int arr[],int t)
    {
        if(arr == null)
        {
            return -1;
        }
        else
        {
            int len = arr.length;
            int i = 0;
             while (i<len)
                 if(arr[i] == t)
                 {
                     return i;
                 }
             else
                 {
                     i=i +1;
                 }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int [] arry = {4,5,6,2,7,8,9,};
        System.out.println("Index of 7:  "+ findIndex(arry,7));


    }
}
