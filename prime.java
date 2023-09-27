import java.util.*;
public class prime
{
    public static void main(String[]args)
    {
         int a , b =0 ;
         Scanner sc= new Scanner(System.in);
         a =sc.nextInt();

         for(int i = 1; i<=a ; i++)
         {
             if(a%i==0)
               b++;
         }
         if(b==2)
         System.out.println("yes");
         else
         System.out.println("no");
         sc.close();

    }
}
