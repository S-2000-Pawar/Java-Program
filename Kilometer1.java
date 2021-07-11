//converts kilometer per hour to miles per hour


import java.util.Scanner;
class Kilometer1
{
   public static void main(String[] args)
   {
     double kmph,miph;
     Scanner Scanner;
     Scanner=new Scanner(System.in);
     System.out.println("Enter the distance in kilometer");
     kmph=Scanner.nextDouble();
     miph=(kmph*0.6213712);
     System.out.println("the miph is" +miph);
   }
}