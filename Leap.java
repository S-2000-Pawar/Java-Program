//check leap year

import java.util.Scanner;
class Leap
{
  public static void main(String[] args)
  {
        int year;
        Scanner Scanner;
        Scanner=new Scanner(System.in);
	System.out.println("Enter a year");
	year=Scanner.nextInt();
	if(year%4==0)
	{
		System.out.println("is a leap year");
	}
	else
	{
		System.out.println("is not a leap year");
	}
	if(year%100==0)
	{
	    System.out.println("is a leap year");
	}
	else
	{
	       System.out.println("is not leap year");
	}
	if(year%400==0)
	{
		System.out.println("is a leap year");
	}
	else
	{
		System.out.println("is not a leap year");
	}
    }
}