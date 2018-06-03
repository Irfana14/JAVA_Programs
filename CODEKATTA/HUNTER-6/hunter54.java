package JUNE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hunter54 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		   a[i]=scan.nextInt();
		int n1=1;
		ArrayList al=new ArrayList();
		ArrayList al2=new ArrayList();
		for(int i=0;i<n1;i++)
		{
			al.add(a[i]);
			Collections.sort(al);
		
			al2.add(al.get(0));
			
			if(n1<a.length)
			  n1++;
			
		}
		for(int i=0;i<al2.size();i++)
			System.out.print(al2.get(i));
			
			
		
			
		
	

	}

}
