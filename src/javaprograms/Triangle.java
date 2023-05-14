package javaprograms;

import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args)
    {
        int h,b,area;
        Scanner ob = new Scanner(System.in);
        System.out.print("h = ");
        h = ob.nextInt();
        System.out.print("b = ");
        b = ob.nextInt();
        area = h*b/2;
        System.out.println("Area of triangle = "+area);
    }
}
