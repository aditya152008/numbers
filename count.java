import java.util.*;
public class count 
{
    public static void main(String[]args)
    {
         int a,b=0 ;
         Scanner sc= new Scanner(System.in);
         a= sc.nextInt();
         
         while(a>0)
         {
          a = a/10;
           b++;

         }
         System.out.println(b);
         sc.close();
    }
}
