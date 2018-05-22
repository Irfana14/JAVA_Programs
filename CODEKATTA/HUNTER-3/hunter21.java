package JUNE;

import java.util.Scanner;

public class hunter21
{

	public static void main(String[] args)
	{
		int n,m,a[][];
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		a=new int[n][m];
		for(int i=0;i<n;i++)
			{
			   for(int j=0;j<m;j++)
			   {
				   a[i][j]=scan.nextInt();
			   }
			}
		//int k=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(a[i][j]==0)
					{
					for(int k=0;k<m;k++)
				
						a[i][k]='0';
					for(int i1=i+1;i1<n;i1++)
						a[i1][j]='0';
					if(i>0)
						for(int i2=i-1;i2>=0;i2--)
							a[i2][j]='0';
						
					}
					
			}
		}
		
		for(int i=0;i<n;i++)
		{
		   for(int j=0;j<m;j++)
		   {
			   if(a[i][j]=='0')
			    a[i][j]=0;
		   }
		}
		for(int i=0;i<n;i++)
		{
		   for(int j=0;j<m;j++)
		   {

            System.out.print(a[i][j]+" ");
		   }
		   System.out.print("\n");
		}
		
		
	}

}
