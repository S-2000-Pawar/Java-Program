//find factorial


class Factorial
{
   public static void main(String[] args)
   {
      	int num=5;
        int mul=1;
	while(num>0)
	{
		mul=num*mul;
		num--;
		System.out.println(mul);
	}
   }
}