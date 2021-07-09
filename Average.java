//to compute the total and average of four numbers


import java.util.Scanner;
class Average
{
   public static void main(String[] args)
   {
     double n1,n2,n3,n4,tot,avrg;
     Scanner Scanner;
     Scanner=new Scanner(System.in);
     System.out.println("Enter the first numbers");
     n1=Scanner.nextDouble();
     System.out.println("Enter the second numbers");
     n2=Scanner.nextDouble();
     System.out.println("Enter the third numbers");
     n3=Scanner.nextDouble();
     System.out.println("Enter the four numbers");
     n4=Scanner.nextDouble();
     tot=n1+n2+n3+n4;
     avrg=tot/4;
     System.out.println("The four numbers of total is" +tot);
     System.out.println("The average of numbers is" +avrg);
    }
}