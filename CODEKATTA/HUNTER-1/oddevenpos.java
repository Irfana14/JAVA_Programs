package JUNE;
import java.util.Scanner;
public class hunter7
{

	public static void main(String[] args)
	{
		int n,a[];
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
				{
				if(a[i]%2!=0)
					System.out.print(a[i]);
				}
			if(i%2!=0)
				{
				if(a[i]%2==0)
					System.out.print(" "+a[i]+" ");
				}
			else
				continue;
			
		}
		
		
		
	}

}
