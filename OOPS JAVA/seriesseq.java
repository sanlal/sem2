import java.util.Scanner;
class seriesseq
  {
	 public static int fact(int n)
	{  
	    int f=1;
	    while(n>0)
		{
			f=f*n;
			n--;
		}
         return f;		
	}
		
    public static void main(String args[])
	{
	   double x , y=1; 
	   int n;
	   Scanner obj=new Scanner(System.in);
	  
	   System.out.println("Enter value of x: ");
	   x=obj.nextDouble();

	   System.out.println("Enter value of n: ");
	   n=obj.nextInt();
	   for(int i=1;i<n;i++)
	    {
		  int k=2*i;
		  int m=fact(k);
		   if(i%2==0)
		    {
			   y=y+((Math.pow(x,k))/m);
		    }
		   else
		    {
			   y=y-((Math.pow(x,k))/m);
		    }
	    }   
		  
	   System.out.println("Sum of series");
	   System.out.println(y);

	
	}
  }