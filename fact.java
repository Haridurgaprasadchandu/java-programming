import java.util.*;
public class fact
  {
    public static void main(String args[])
    {
      int n,fact=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value for Factorial");
      n=sc.nextInt();

      int i=1;
     
   //   System.out.println("Factorial of Given No is:"+" "+n);

      while(i<=n)
        {
          fact*=i;
          i=i+1;
        }
    System.out.println(fact);
      }    
  }