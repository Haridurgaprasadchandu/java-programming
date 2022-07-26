import java.util.*;
class table1
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value for Multiplication Table");
      n=sc.nextInt();

      int i=1;
     
     
      while(i<=10)
        {
          System.out.println(n+"*"+i+"="+(n*i));
          i=i+1;
        }
      }    
  }