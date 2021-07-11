//write a program in java to print a mystery series from 1 to 50


class Mystery
{
   public static void main(String[] args)
   {
     int i=1;
     while(true)
     {
       ++i;
       if((i%3)==0)
       continue;
       if (i==50)
       break;
       if((i%2)==0)
       {
         i+=3;
        }
        else
        {
          i-=3;
        }
        System.out.println(i);
    }
  }
}
  