package JUNE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hunter63 
{

	public static void main(String[] args) 
	{
         Scanner scan=new Scanner(System.in);
         int a[];
         String s3 = null;
         int n=scan.nextInt();
         ArrayList al=new ArrayList();
         ArrayList al2=new ArrayList();
         StringBuffer sb=new StringBuffer();
         a=new int[n];
         for(int i=0;i<n;i++)
         {
        	a[i]=scan.nextInt(); 
        	s3=sb.append(a[i]).toString();
         }
         int k=1;
         for(int i=1;i<n;i++)
         {
        	for(int j=k;j<n;j++)
        		{
        		  al.add(a[j]);
        		}
        		  Collections.sort(al);
        		  Collections.reverse(al);
        		  System.out.print(al);
        		  al2.add(al.get(0));
        		  al.removeAll(al);
        		  k=k+1;
        	 
         }
         //System.out.print(al2);
        for(int i=0;i<al2.size();i++)
        	System.out.print(al2.get(i)+" ");
        System.out.print("0"); 

	}

}
