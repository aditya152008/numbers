import java.util.*;
public class pae 
{
    public static void main(String[]args)
    {
        int  a, b=0 , c=0;
        Scanner sc= new Scanner(System.in);
        a =sc.nextInt();

        b=a ;
        while(a>0)
        {
            c= c*10+a%10;
            a=a/10;
        }
        if(c==b)
        System.out.println("yes");
        else
        System.out.println("no");
        sc.close();
    }

    
}