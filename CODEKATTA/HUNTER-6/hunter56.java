package JUNE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hunter56 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
	ArrayList al=new ArrayList();
		for(int i=0;i<(n-1);i++)
		{
			int sum=0;
			for(int j=i+1;j<n;j++)
			{
				sum=Math.abs(a[i]+a[j]);
				al.add(sum);
				
			}
		}
			Collections.sort(al);
		    
			for(int i=0;i<(n-1);i++)
			{
				int sum=0;
				for(int j=i+1;j<n;j++)
				{
					sum=Math.abs(a[i]+a[j]);
					if(sum==(Integer) al.get(0))
					{
						System.out.print(a[i]+" "+a[j]);
						System.exit(0);
					}
				}
			}
			
		
	}

}
