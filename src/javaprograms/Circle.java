package javaprograms;

import java.util.Scanner;

public class Circle
{
    public static void main(String[] args)
    {
        int r;
        double pi=3.14,area;
        Scanner ob = new Scanner(System.in);
        System.out.print("r = ");
        r = ob.nextInt();
        area = pi*r*r;
        System.out.println("Area of circle="+area);

    }
}
