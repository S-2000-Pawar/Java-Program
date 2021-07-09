//convert temp in celsius to kelvin


import java.util.Scanner;
class Cel
{
   public static void main(String[] args)
   {
     double cel,kel;
     Scanner Scanner;
     Scanner=new Scanner(System.in);
     System.out.println("Enter the temp in celsius");
     cel=Scanner.nextDouble();
     kel = cel+273.15;
     System.out.println("The temp in kelvin" +kel);
    }
}