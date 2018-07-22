package TEST;
import java.util.Scanner;
import java.util.*;
public class nnmatrix 
{
   public static void main(String args[])
   {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int a[][]=new int[n][n];
	for(int i=0;i<n;i++)
		{
		  for(int j=0;j<n;j++)
		  {
			  a[i][j]=scan.nextInt();
			  
		  }//for
		  
		}//for
	ArrayList al=new ArrayList();
	int sum=0;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==j)
				sum=sum+a[i][j];
				
		}//for
		
	}//for
	int sum1=0;
	int t=n;
    for(int i=0;i<n;i++)
    {
    	for(int j=(t-1);j>=0;)
    	{
    		
    		sum1=sum1+a[i][j];
    		t--;
    		break;
    	}//for
    	
    }//for
    System.out.print(sum1);
	
   }//main
}//class
