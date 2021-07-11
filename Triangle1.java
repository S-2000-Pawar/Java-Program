//Area of any triangle using Heron's formula

import java.util.Scanner;
class Triangle1
{
   public static void main(String[] arg)
   { 
      double a,b,c,area,s;
      Scanner Scanner;
      Scanner =new Scanner(System.in);
      System.out.println("Enter the first side");
      a =Scanner.nextDouble();
      System.out.println("Enter the second side");
      b =Scanner.nextDouble();
      System.out.println("Enter the third side");
      c =Scanner.nextDouble();
      s=(a+b+c)/2;
      area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.println("area of triangle" +area);
   }
}
      