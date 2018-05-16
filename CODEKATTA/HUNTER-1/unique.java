package JUNE;

import java.util.ArrayList;
import java.util.Scanner;

public class hunter3
{	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
			
		int n,a[],count[];
		
		 n=scan.nextInt();
		 
		
		 ArrayList al=new ArrayList();
		 a=new int[n];
		 count=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		for(int i=0;i<a.length;i++)
			count[i]=1;
		for(int i=0;i<n-1;i++)
			{
			for(int j=i+1;j<n;j++)
			{
			   if(a[i]==a[j])
				   {
				   a[j]='*';
				   count[i]=count[i]+1;
				   }
			}
			}	   
			    
		for(int i=0;i<count.length;i++)
			if(count[i]<2&&a[i]!='*')
				System.out.print(a[i]);
			   
		
			
	}

}
