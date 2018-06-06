package JUNE;

import java.util.ArrayList;
import java.util.Scanner;

public class hunter65 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();int n1=scan.nextInt();
		int a[];
		a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		ArrayList al=new ArrayList();
		for(int i=0;i<n;i++)
		{
		  if(a[i]==n1)
		  {
			  a[i]='*';
		  }
		  else
			  al.add(a[i]);
		}
		
			if(al.size()>0)
			{	for(int i=0;i<al.size();i++)
				{
				System.out.print(al.get(i));
				}
			}
			else
				System.out.print("empty");
		
		
		
		

	}

}
