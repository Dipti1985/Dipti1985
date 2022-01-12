package String;

public class A3 {
    static final int MAX_CHARS = 100;
    static void CountCharacters(String str1, int[] ctr)
    {
        for (int i = 0; i < str1.length();  i++)
            ctr[str1.charAt(i)]++;
    }
    static void showDuplicates(String str1)
    {
        int ctr[] = new int[MAX_CHARS];
        CountCharacters(str1, ctr);
        for (int i = 0; i < MAX_CHARS; i++)
            if(ctr[i] > 1)
                System.out.printf("%c  appears  %d  times\n", i,  ctr[i]);
    }
    public static void main(String[] args)
    {
        String str1 = "Dipti Rami";
        System.out.println("The given string is: "+str1);
        System.out.println("The duplicate characters and counts are: ");
        showDuplicates(str1);
    }
}
