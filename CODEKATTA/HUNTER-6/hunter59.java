package JUNE;

import java.util.ArrayList;
import java.util.Scanner;

public class hunter59 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		ArrayList al=new ArrayList();
		ArrayList al1=new ArrayList();
		ArrayList al2=new ArrayList();
		int n=scan.nextInt();
		int a[],b[];
		a=new int[n];b=new int[n];
		for(int i=0;i<n;i++)
			{a[i]=scan.nextInt();
		    al.add(a[i]);}
		for(int i=0;i<n;i++)
		{b[i]=scan.nextInt();
	    al1.add(b[i]);}
		for(int i=0;i<n;i++)
		 {
			int val=(Integer)(al.get(i))+(Integer)(al1.get(i));
			al2.add(val);
		 }
		for(int i=0;i<al2.size();i++)
			System.out.print(al2.get(i)+" ");

	}

}
