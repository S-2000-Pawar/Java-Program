//find largest element in an array

import java.util.Scanner;
class Largest
{
   public static void main(String[] args)
   {
       int i, n;
       Scanner Scanner;
       Scanner=new Scanner(System.in);
       System.out.println("Enter array size");
       n=Scanner.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter array element");
      for(i = 0; i < n;i++)
      {
        
       arr[i]=Scanner.nextInt();
      }
       int largest=arr[0];
      for(i = 0;i < n; i++)
      {
       if(largest < arr[i])
       {
           largest = arr[i];
       }
      }
    System.out.println("Largest element in array is" +largest);
   }
}