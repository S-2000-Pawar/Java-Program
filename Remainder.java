//to compute quotient and remainder


import java.util.Scanner;
class Remainder
{
   public static void main(String[] args)
   {
     int dividend,divisor,quotient,remainder;
     Scanner Scanner;
     Scanner=new Scanner(System.in);
     System.out.println("Enter the divident");
     dividend=Scanner.nextInt();
     System.out.println("Enter the divisor");
     divisor=Scanner.nextInt();
     quotient=dividend/divisor;
     remainder=dividend % divisor;
     System.out.println("The quotient of the division is" +quotient);
     System.out.println("The reminder of the division is" +remainder);
    }
}