import java.util.*;
class f
  {
    public static void main(String args[])
    {
      int n,f=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter");
      n=sc.nextInt();
	int i=0;
	while(i<=n)
	{
	f=f*i;
	i=i+1;
	}
	System.out.println(f);
     

      }    	
  }