//write a program in java that takes a number as input and prints its multiplication table upto 10



import java.util.Scanner;
class Multiplication
{ 
   public static void main(String[] args)
   {
     int n, k;
     Scanner Scanner;
     Scanner=new Scanner(System.in);
     System.out.println("Enter a number");
     n=Scanner.nextInt(); 
     for(int i=1;i<=10;i++)
     {
                                              
	k=n*i;
        System.out.println(n + "*"+ i + " = " + k); 
				               
     }
       
     }
   
}
