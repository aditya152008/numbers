import java.util.*;
public class niven 
{
    public static void main(String[]args)
    {
         int a=0,ab=0,  b =0 , c =0 , d=0;
         Scanner sc= new Scanner(System.in);
         ab = sc.nextInt();
        a= ab;
          while(a>0)
          {
             c= a%10 ;
             b =b+c;
             a= a/10 ;   
          }
          d= ab%b;
          if(d==0)
          System.out.println("yes");
          else
          System.out.println("no");
          sc.close();
    }
    
}
