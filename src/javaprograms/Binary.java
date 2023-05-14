package javaprograms;

public class Binary
{
    public static void main(String[] args)
    {
      String b0 = "10";
      String b1 = "11";
      int number0 = Integer.parseInt(b0,2);
      int number1 = Integer.parseInt(b1,2);
      int sum = number0+number1;
        System.out.println(Integer.toBinaryString(sum));



    }
}
