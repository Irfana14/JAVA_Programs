package JUNE;
import java.util.Scanner;
public class hunter4 
{

	public static void main(String[] args)
	{
		int n,n1,a[],b[],count=0;
	Scanner scan=new Scanner(System.in);
	n=scan.nextInt();
	a=new int[n];
	n1=scan.nextInt();
	b=new int[n1];
	for(int i=0;i<n;i++)
		a[i]=scan.nextInt();
	for(int i=0;i<n1;i++)
		b[i]=scan.nextInt();
	if(b.length<a.length)
	{
		for(int i=0;i<a.length;i++)
			{
			for(int j=0;j<b.length;j++)
				{
				if(a[i]==b[j])
					count=count+1;
				}
			}
		if(count<=(a.length-1)&&count>0)
		{
			System.out.print("YES");
		}
		else
			System.out.print("NO");
					
	}
	else
	{
		for(int i=0;i<b.length;i++)
		{
		for(int j=0;j<a.length;j++)
			{
			if(b[i]==a[j])
				count=count+1;
			}
		}
		
		if(count<=(b.length-1)&&count>0)
		{
			System.out.print("YES");
		}
		else
			System.out.print("NO");
		
		
	}
	
		
	
	
	
	
	
	
	}

}
