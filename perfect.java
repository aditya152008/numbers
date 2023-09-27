import java.util.*;

public class perfect

{
   public static void main(String[]args) 
   {
      int s ,sd=0;
      Scanner sc= new Scanner(System.in);
      s= sc.nextInt();

      for(int i = 1 ; i<=s/2; i++)
      {
          if(s%i==0)
           sd =sd+i;
      }
      if(sd==s)
      System.out.println("yes");
      else
      System.out.println("no");

      sc.close();
   }
}
