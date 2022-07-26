import java.util.*;
class ser
  {
    public static void main(String args[])
    {
      int n,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Number");
      n=sc.nextInt();
     
   // System.out.println("Sum of Series" + n + ":");
     
 // System.out.print("1"+"+");
    for (int i = 1; i <= n; i++) {
       System.out.print("1"+"/"+i+"+");
        sum=sum+1/i;
      }

      System.out.println(sum);
    }
}