//Addition of two numbers


import java.util.Scanner;
class Add1
{
   public static void main(String[] arg)
   {
     Scanner kb=new Scanner(System.in);
     System.out.println("Enter the first number");
     int a=kb.nextInt();
     System.out.println("Enter the second number");
     int b=kb.nextInt();
     int sum=a+b;
     System.out.println("sum of"+a+"and "+b+"and "+sum);
   }
}