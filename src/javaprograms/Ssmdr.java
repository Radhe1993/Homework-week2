package javaprograms;

import java.util.Scanner;

public class Ssmdr
{
    int fn, sn, sum, sub, mul, div, rem;

    public  void addition ()
        {

            Scanner ob = new Scanner(System.in);
            System.out.print("fn= ");
            fn = ob.nextInt();
            System.out.print("sn= ");
            sn = ob.nextInt();
            sum = fn + sn;
            System.out.println("sum= " + sum);
        }
        public  void subtraction ()
        {

            sub = fn - sn;
            System.out.println("sub= " + sub);
        }
        public  void multiplication ()
        {
            mul = fn * sn;
            System.out.println("mul= " + mul);
        }
        public  void division ()
        {

            div = fn / sn;
            System.out.println("div= " + div);
        }
        public  void remainder ()
        {

            rem = fn % sn;
            System.out.println("rem= " + rem);

        }



    public static void main(String[] args)
    {
        Ssmdr obj = new Ssmdr();
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
        obj.remainder();



    }
}








