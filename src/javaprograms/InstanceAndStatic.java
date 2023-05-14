package javaprograms;

public class InstanceAndStatic
{
    int a=10;
    static int b=5;

    public void getdata()
    {
        System.out.println(a);
    }
    public static void putdata()
    {
        System.out.println(b);
    }

    public static void main(String[] args)
    {

        InstanceAndStatic obj = new InstanceAndStatic();
        obj.getdata();
        putdata();

    }

}
