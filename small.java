import java.util.*;
public class small
{
    public static void main(String[]args)
    {
           int a ,s =10, c;

           Scanner sc = new Scanner(System.in);
           a =sc.nextInt();
           while(a>0)
           {
            c = a%10;
            if(c<s)
            s=c;
            a =a/10;
           }
           System.out.println(s);

           sc.close();


    }
}
