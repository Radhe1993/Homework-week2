package javaprograms;

import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        double h,w,area,peri;
        Scanner ob = new Scanner(System.in);
        System.out.print("h= ");
        h = ob.nextDouble();
        System.out.print("w= ");
        w = ob.nextDouble();
        area = h*w;
        peri = 2*(h+w);
        System.out.println("Area of rectangle= "+area);
        System.out.println("perimeter= "+peri);
    }
}
