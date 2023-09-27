import java.util.*;
public class menu
 {
    public static void main(String[]args)
    {
        int ch ;
        Scanner sc= new Scanner(System.in);
        ch = sc.nextInt();

        System.out.println("enter the number");
        int a = sc.nextInt();

        switch(ch){
             case 1 :
             if(a%10==7||a%7==0)
               System.out.println("buzz no");
               else 
                 System.out.println("not a buzz no");
                 break;

                 case 2 :
                 int b,c=0 ,d=0 ,e=0;

                 
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




        }
        sc.close();
    }
    
}
