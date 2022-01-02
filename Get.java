public class Get {

    public String name;
    public int age;
    public float height;

    public void SetValue(String n,int a,float h) {
        name = n;
        age = a;
        height = h;
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);

    }
    class Set
    {
        public static void main(String[] args) {
            Get g = new Get();
            {
                g.SetValue("Deep",34,12.24f);
                g.display();
            }

        }
    }

}
