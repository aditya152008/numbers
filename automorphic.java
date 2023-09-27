import java.util.*;

public class automorphic
 {
    public static void main(String[]args)
    
    {
        int a , b,c=0 ,d=0 ,e=0;
        Scanner sc  = new Scanner(System.in);
        a= sc.nextInt();

        b= a*a;

       c=a;
        while(c>0)
        {
            c=c/10;
            d++;
        }
        e= (int)(b%(Math.pow(10,d)));
        if(a==e)
        System.out.println("yes");
        else
         System.out.println("no");

         sc.close();
    }
 }