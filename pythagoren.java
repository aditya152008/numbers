import java.util.*;
public class pythagoren
 {
    public static void main(String[]args)
    {
        int a ,b, c;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 3 sides of triamgle");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a)
        System.out.println("yes");
        else
        System.out.println("no");

        sc.close();
                

    }
    
}
