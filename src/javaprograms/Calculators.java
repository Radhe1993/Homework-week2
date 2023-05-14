package javaprograms;

public class Calculators
{


    public void addition(int a,int b)
    {
        int sum = a+b;
        System.out.println("addition of " + a + " and " +b+ " is = "+sum);
    }
    public void subtraction(int a,int b)
    {
        int sub = a-b;
        System.out.println("Subtraction of " + a + " and " +b+ " is = "+sub);
    }
    public static void multiplication(int a,int b)
    {
        int mul = a*b;
        System.out.println("Multiplication of " + a + " and " +b+ " is = "+mul);
    }
    public static void division(int a,int b)
    {
        int div = a/b;
        System.out.println("Division of " + a + " and " +b+ " is = "+div);
    }
    public static void main(String[] args)
    {
        Calculators obj = new Calculators();
        obj.addition(10, 5);
        obj.subtraction(10, 5);
        multiplication(10, 5);
        division(10, 5);
    }


    }
















