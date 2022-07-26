import java.util.*;
class table2
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value for Multiplication Table");
      n=sc.nextInt();

     for(int i=1;i<=10;i++)
        {
		System.out.println(n+"*"+i+" ="+(n*i));	
		}

      }    	
  }