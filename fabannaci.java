import java.util.*;

public class fabannaci
 {
    public static void main(String[]args)
    {
         int n1 = 0 , n2= 0,n3 =1 , s= 0 ;

         Scanner sc= new Scanner(System.in);
       int   a = sc.nextInt();

         System.out.print(n1);
           System.out.print(n2);
            System.out.print(n3);

            s= n1 + n2+n3;

            while(s<=a)
            {
                System.out.print(s);
                n1 = n2;
                n2 =n3;
                n3 = s;
                s= n1 +n2+n3;
            }

            sc.close();

    }
}
