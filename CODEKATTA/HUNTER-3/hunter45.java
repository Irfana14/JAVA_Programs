package JUNE;

import java.util.Scanner;

public class hunter45 
{

	public static void main(String[] args) 
	{
	int a[];
	
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		a=new int[n+1];
		for(int i=1;i<=n;i++)
			a[i]=scan.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			int n1=i*a[i];
			//System.out.print(n1+"\n");
			for(int i1=1;i1<=n;i1++)
				{
				if(n1==a[i1])
					{
					//System.out.print(a[i]);
			     count=count+1;
			     break;}
				}//for	
			
		}//for
		System.out.print(count);
	}

}
