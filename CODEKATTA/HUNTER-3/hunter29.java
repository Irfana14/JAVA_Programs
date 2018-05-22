package JUNE;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class hunter29
{
	public static void main(String[] args)
	{
		int n,a[];
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		a=new int[n];
		ArrayList al=new ArrayList();
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		//List[] al1=new List[n];
		int max=a[0];
		for(int i=0;i<n-1;i++)
		{	int sum=0;
			 sum=a[i];
			
			for(int j=i+1;j<n;j++)
		     {
			   sum=sum+a[j];
			    if(sum>max)
			    	max=sum;
			    		
		     }
		}
		
		System.out.print(max);
		
		

	}

}
