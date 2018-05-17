package JUNE;

import java.util.Scanner;

public class hunter8
{

	public static void main(String[] args) 
	{
		int n,a[];
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		for(int i=0;i<(a.length-1);i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				int sum=0;
				sum=sum+a[i]+a[j];
				if(sum==0)
					System.out.print(a[i]+" "+a[j]);
			}
		}
		
		

	}

}
