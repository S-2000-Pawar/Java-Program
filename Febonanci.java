//febonanci series

import java.util.Scanner;
class Febonanci
{
  public static void main(String[] args)
  {
       int n,f,f1=-1,f2=1;
       Scanner Scanner;
       Scanner=new Scanner(System.in);
       System.out.println("Enter the numbers");
       n=Scanner.nextInt();
       System.out.println("The fibonacci series is");
	while(n>0)
	{
		f=f1+f2;
		f1=f2;
		f2=f;
	      System.out.println(f);
		n--;
	}
    }
}