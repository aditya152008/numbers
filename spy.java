import java.util.*;

public class spy
 {
    public static void main(String[]args)
    {
        int a ,  c=1 , d=0;
        Scanner sc = new Scanner (System.in);
        a = sc.nextInt();
        

         while(a >0)
         {
            int b= a%10 ;
             d= d+b;
             c=c*b;
             a= a/10;

         }
        if(d==c)
       System.out.println("yes");
       else
       System.out.println("no");


    sc.close();

    }
    
}
