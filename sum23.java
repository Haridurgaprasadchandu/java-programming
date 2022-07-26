import java.util.*;
public class sum23
  {
    public static void main(String args[])
    {
      double n,sum=0.0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Number");
      n=sc.nextDouble();
     
    System.out.println("Sum of Series" + n + ":");
     
  System.out.print("1"+"+");
    for (double i = 1; i <= n; i++) {
       System.out.print("1"+"/"+i+"+");
        sum=sum+1/i;
      }
      System.out.println("");
      System.out.println("---------Output-------");
      System.out.println(sum);
    }
}