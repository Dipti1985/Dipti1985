package Exception;
import java.util.Scanner;
public class InsuficiantBalanceException {
    static void fun() throws IllegalAccessException
    {
        double balance = 0, damount, wamount;

        Scanner dep=new Scanner(System.in);
        System.out.println("Deposit an amount");
        damount=dep.nextInt();
        balance += damount;

        Scanner wd=new Scanner(System.in);
        System.out.println("Withdraw an amount");
        wamount=wd.nextInt();
        balance -= wamount;


        if (balance<0)
        {
            throw new IllegalAccessException();
        }
        else
            System.out.println(balance);
    }



    public static void main(String args[])
    {

        try
        {
            fun();
        }
        catch(IllegalAccessException ex)
        {
            System.out.println("Sorry, insufficient balance, you need more");
        }
    }
}
