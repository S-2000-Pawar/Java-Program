//radius of circle from the user

import java.util.Scanner;
class Circle1
{
   public static void main(String[] arg)
   {
     int r;
     double pie=3.14;
     Scanner Scanner;
     Scanner=new Scanner(System.in);
     System.out.println("Enter the radius");
     r=Scanner.nextInt();
     double area=pie*r*r;
     double circum=2*pie*r;
     System.out.println("area of circle" +area);
     System.out.println("circumference of circle" +circum);
  }
}