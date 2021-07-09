//find the third angle of triangle


import java.util.Scanner;
class Angle
{
   public static void main(String[] args)
   {
     double a,b,c;
     Scanner Scanner;
     Scanner=new Scanner(System.in);
     System.out.println("Enter first angle");
     a=Scanner.nextDouble();
     System.out.println("Enter second angle");
     b=Scanner.nextDouble();
     c=180-(a+b);
     System.out.println("third angle is" +c);
   }
}