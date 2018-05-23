package JUNE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hunter31
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
				{	int mul=1;
					 mul=a[i];
					
					for(int j=i+1;j<n;j++)
				     {
					   mul=mul*a[j];
					   
					   
					    		
				     }
					al.add(mul);
				}
				Collections.sort(al);
				Collections.reverse(al);
				System.out.print(al.get(0));
				
				

		
			

	}

}
