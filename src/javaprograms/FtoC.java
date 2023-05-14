package javaprograms;

import java.util.Scanner;

public class FtoC
{
    public static void main(String[] args)
    {
            double f,c;
            Scanner ob = new Scanner(System.in);
            System.out.print("f = ");
            f = ob.nextInt();
            c = ((f-32)*5/9);

            System.out.println("Celsius= "+c);



    }

}
