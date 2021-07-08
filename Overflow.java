//To check overflow/undrflow during various arithmatic opretion


class Overflow
{
   public static void main(String[] arg)
   {
      int n1=214748367;
      System.out.println("Overflow" +(n1+1));
      System.out.println("Incresing range" +(n1+2));
      System.out.println("Product" +(n1*n1));
      int n2= -214748367;
      System.out.println("Underflow" +(n2-1));
      System.out.println("Decreasing range" +(n2-2));
      System.out.println("Product" +(n2*n2));
   }
}


