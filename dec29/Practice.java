package dec29;

public class Practice {
    public static void main(String[] args) {
      for(int i=1;i<=5;i++)
      {
          for(int p=2;p<=i;p++)
          {
              System.out.print(" ");
          }
          for(int q=5;q>=i;q--)
          {
              System.out.print(" *");
          }

          System.out.println();
      }

    }
}

