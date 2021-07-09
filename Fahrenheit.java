//to convert temperature in fahreheit to celsius

import java.util.Scanner;
class Fahrenheit
{
   public static void main(String[] args)
   {
     double frh,cel;
     Scanner Scanner;
     Scanner=new Scanner(System.in);
     System.out.println("Enter the temp in fahrenheit");
     frh=Scanner.nextDouble();
     cel=((frh*5.0)-(5.0*32))/9;
     System.out.println(cel);
    }
}
      