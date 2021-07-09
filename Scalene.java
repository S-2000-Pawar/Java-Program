//find the area of scalene triangle


import java.util.Scanner;
class Scalene
{
   public static void main(String[] args)
   {
     double side1,side2,ang1,area;
     double pie=3.14;
     Scanner Scanner;
     Scanner=new Scanner(System.in);
     System.out.println("Enter the side of triangle");
     side1=Scanner.nextDouble();
     System.out.println("Enter the  another side of triangle");
     side2=Scanner.nextDouble();
     System.out.println("Enter the angle between two side of triangle");
     ang1=Scanner.nextDouble();
     area=(side1*side2*Math.sin((pie/180)*ang1))/2;
     System.out.println("The area of scalene triangle is" +area);
    }
}