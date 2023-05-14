package javaprograms;

public class Two
{
    int a = 2,b = 4;
    static int m = 6,n = 8;

    public void getdata()
    {
        System.out.println(a);
        System.out.println(b);
    }
    public static void putdata()
    {
        System.out.println(m);
        System.out.println(n);
    }

    public static void main(String[] args)
    {
        Two obj = new Two();
        obj.getdata();
        putdata();

    }
}
