package JUNE;
import java.util.Scanner;
public class multiply 
{
	public static void main(String[] args) 
	{
		 int n,a[],m;
		Scanner scan=new Scanner(System.in);
	    n=scan.nextInt();
	    a=new int[n];
	    for(int i=0;i<n;i++)
	     	a[i]=scan.nextInt();
	    
	    for(int i=0;i<n;i++)
	    {    m=1;
	    	for(int j=0;j<n;j++)
	    	{
	    		
	    		if(i!=j)
	    		  m=m*a[j];
	    	}
	    	System.out.print(m+" ");
	    }
	    
	    

	}

}
