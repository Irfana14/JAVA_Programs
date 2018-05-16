package JUNE;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class hunter2 
{
	
	public static void main(String[] args)
	{
		int n,a[];
	
		int count=0;
		Scanner scan=new Scanner(System.in);
		 n=scan.nextInt();
		 
		
		 ArrayList al=new ArrayList();
		 a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
	
		for(int i=0;i<n;i++)
		{
			if(i==a[i])
			{
		    al.add(a[i]);
		   
			}
		}
			Collections.sort(al);
			if(al.size()!=0)
			{for(int i1=0;i1<al.size();i1++)
			{
				
				System.out.print(al.get(i1));
			}
			}
			else
				System.out.print("-1");
				
				
			
		
		
	}
		
}
