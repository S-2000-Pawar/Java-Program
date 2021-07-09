//convert temp in fahrenheit to kelvin


import java.util.Scanner;
class Frh
{
   public static void main(String[] args)
   {
     double frh,kel;
     Scanner Scanner;
     Scanner=new Scanner(System.in);
     System.out.println("Enter the temp in fahrenheit");
     frh=Scanner.nextDouble();
     kel = (5.0 / 9) * (frh - 32) + 273.15;
     System.out.println("The temp in kelvin" +kel);
    }
}