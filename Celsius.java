//convert temp in kelvin to celsius


import java.util.Scanner;
class Celsius
{
   public static void main(String[] args)
   {
     double kel,cel;
     Scanner Scanner;
     Scanner=new Scanner(System.in);
     System.out.println("Enter the temp in kelvin");
     kel=Scanner.nextDouble();
     cel=kel-273.15;
     System.out.println("The temp in celcius is" +cel);
    }
}