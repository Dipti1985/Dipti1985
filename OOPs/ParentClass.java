package OOPs;
 class ParentClass {
     void print(){
         System.out.println("Thos is parent Class");
     }

}
class child extends ParentClass{
     void print(){
         System.out.println("This is Child Class");
     }

    public static void main(String[] args) {
        ParentClass p = new ParentClass();
        child c = new child();
        c.print();
        p.print();
    }
}
