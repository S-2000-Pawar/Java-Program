//bubble sort


import java.util.Scanner;
class Bubble
{
   public static void main(String[] args)
   {
       int n, i, j, temp;
       Scanner Scanner;
       Scanner=new Scanner(System.in);
     System.out.println("Enter the Size (max. 50)");
     n=Scanner.nextInt();
    System.out.println("Enter "+n);
    int arr[]=new int[n];
    System.out.println("Enter array element");
    for(i=0; i<n; i++)
    {
        arr[i]=Scanner.nextInt();
    }
    System.out.println("Sorting the Array using Bubble Sort Technique");
    for(i=0; i<(n-1); i++)
    {
        for(j=0; j<(n-i-1); j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    System.out.println("Array Sorted Successfully");
    System.out.println("The New Array is");
    for(i=0; i<n; i++)
    {
        System.out.println(arr[i]);
    }
    
    }
}