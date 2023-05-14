package javaprograms;

import java.util.Scanner;

public class Swap
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner ob = new Scanner(System.in);
        System.out.print("a= ");
        a = ob.nextInt();
        System.out.print("b= ");
        b = ob.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("a= "+a);
        System.out.println("b= "+b);


    }
}
