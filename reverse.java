import java.util.*;
public class reverse
 {
    public static void main(String[]args)
    {
         int c = 0 , a ;
         Scanner sc= new Scanner(System.in);
         a= sc.nextInt();

         while(a>0)
         {
             c = c*10+ a%10;
             a = a/10;
         }
         System.out.println(c);
         sc.close();
    }
    
}
