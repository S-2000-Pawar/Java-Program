//convert temp in kelvin to fahrenheit


import java.util.Scanner;
class Kelvin
{
   public static void main(String[] args)
   {
     double frh,kel;
     Scanner Scanner;
     Scanner=new Scanner(System.in);
     System.out.println("Enter the temp in kelvin");
     kel=Scanner.nextDouble();
     frh=(9.0/5)*(kel-273.15)+32;
     System.out.println("the temp in frh is" +frh);
    }
}