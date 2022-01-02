package dec29;

public class FindintDigit {
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
        FindintDigit f = new FindintDigit();
        f.findDigit(120000);
    }
}
