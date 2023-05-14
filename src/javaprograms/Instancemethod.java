package javaprograms;

public class Instancemethod
{
    int a=10,b=5;

    public void getdata()
    {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args)
    {
        Instancemethod obj = new Instancemethod();
        obj.getdata();

    }
}
