import java.util.*;

public class pronic 
{
    public static void main(String[]args)
    {
        int f=0 , a ;
        Scanner sc = new Scanner(System.in);
        a =sc.nextInt();

        for(int i = 1 ; i<=a; i++)
        {
             if(i*(i+1)==a)
             {
                f=1;
                break;
             }
             
        }
        if(f==1)
        System.out.println("yes");
        else
        System.out.println("no");   

        sc.close();

    }
}
