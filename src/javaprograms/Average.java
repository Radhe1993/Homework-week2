package javaprograms;

import java.util.Scanner;

public class Average
{
    public static void main(String[] args)
    {
        int a,b,c,sum,avg;
        Scanner ob = new Scanner(System.in);
        System.out.print("a= ");
        a = ob.nextInt();
        System.out.print("b= ");
        b = ob.nextInt();
        System.out.print("c= ");
        c= ob.nextInt();
        sum = a+b+c;
        avg = sum/3;
        System.out.println("Average of three number= "+avg);
    }
}
