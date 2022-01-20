package Fundamental;

public class B25CountNoDigit {
    void findDigit(int p)
    {
        int result = 0;
        while( p>0)
        {
            p=p/10;
            result ++;
        }

        System.out.println("No of Digit is :- " +result);
    }

    public static void main(String[] args) {
        B25CountNoDigit f = new B25CountNoDigit();
        f.findDigit(120000);
    }
}
