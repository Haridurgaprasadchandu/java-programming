import java.util.*;
class pattern11
  {
    public static void main(String args[])
    {
     
      int i, j;
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Number");
      n=sc.nextInt();

        for(i=0;i<n;i++)
            {          
              System.out.print(" ");
             for(j=0; j<=i; j++)
              {      
                System.out.print("* ");
               }          
             System.out.println();
            }
    }
  }