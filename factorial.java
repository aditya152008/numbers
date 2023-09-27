import java.util.*;
public class factorial 
{
    public static void main(String[]args)
    {
         int a , f = 1 ;
         Scanner sc= new Scanner(System.in);
         a = sc.nextInt();

         for(int i = 1 ; i<= a; i++)
         {
              f=f*i;
         }
         System.out.println(f);

         sc.close();
    }
}
