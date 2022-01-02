public class ifelseif {
    public static void main(String[] args) {
        int mark = 75;
        if(mark<50)
        {
            System.out.println("fail");
        }
        else if(mark>=50 && mark<60)
        {
            System.out.println("D Class");
        }
        else if(mark>=60 && mark<70)
        {
            System.out.println("C Class");
        }
        else if(mark>=70 && mark<80)
        {
            System.out.println("B Class");
        }
        else if(mark>=80 && mark<90)
        {
            System.out.println("A Class");
        }
        else
        {
            System.out.println(" invalid input");
        }



    }
}
