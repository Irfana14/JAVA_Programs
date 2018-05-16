package JUNE;
import java.util.Scanner;
public class hunter1 
{
	public static void main(String[] args)
	{
		int n,a[],t;
		
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		for(int i=0;i<(n-1);i++)
		 {
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
					{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
					}
			}
		 }
			 
		for(int i=0;i<n;i++)
			{
			  System.out.print(a[i]);
		           if(i<(n-1))
		        	System.out.print(" ");
			}
		
		

	}

}
