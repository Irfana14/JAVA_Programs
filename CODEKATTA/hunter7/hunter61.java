package JUNE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hunter61n 
{

	public static void main(String[] args) 
	{
		int a[];
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();int k=scan.nextInt();int k1=scan.nextInt();
		a=new int[n];
		int pos=0,pos1=0;
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		ArrayList al=new ArrayList();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[j]==k)
				{
				pos=j;
				a[j]='*';
			    break;
			    
				}
			
			}
			
			for(int p=0;p<n;p++)
			{
				
				if(a[p]==k1)
				{
				pos1=p;
				a[p]='*';
			    break;
			    
				}
			
		    }
			int val=Math.abs(pos-pos1);
		al.add(val);
	
	}//for
	    Collections.sort(al);
		System.out.print(al.get(0));
	}

}
