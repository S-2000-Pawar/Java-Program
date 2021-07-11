//volume of sphere

import java.util.Scanner;
class Sphere1
{
   public static void main(String[] arg)
   {
      int r;
      double pie=3.14;
      Scanner Scanner;
      Scanner=new Scanner(System.in);
      System.out.println("Enter the radius");
      r=Scanner.nextInt();
      double volume=(4*pie*r*r*r)/3;
      System.out.println("volume of sphere" +volume);
   }
}