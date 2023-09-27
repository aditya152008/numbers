import java.util.*;
public class armstrong
 {
    public static void main(String[]args)
    {
        int a ,b=0,c=0,d;
      long p ,s=0;

      Scanner sc= new Scanner(System.in);
       a = sc.nextInt();
       c=a;
       while(a>0)
       {
          a = a/10;
          b++;
       }
       a= c;
       while(a>0)
       {
          d = (int)a%10;
          p = (int)Math.pow(d,b);
          s = s+p;
          a = a/10;
       }
       if( c==s)
       System.out.println("yes");
       else
       System.out.println("no");

       sc.close();
    }

}
