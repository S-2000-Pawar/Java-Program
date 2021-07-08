//convert temperature in celsius to fahrehheit


import java.util.Scanner;
class Temp
{
    public static void main (String[] arg)
    {
      double frh,cel;
      Scanner Scanner;
      Scanner=new Scanner(System.in);
      System.out.println("Enter the temp in celsius");
      cel=Scanner.nextDouble();
      frh=((cel*9.0)/5.0)+32;
      System.out.println("The temp in fahrehheit" +frh);
    }
}