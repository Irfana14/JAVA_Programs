package JUNE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class hunter34 
{ static TreeSet t= new TreeSet();
	
	static String swap(String a, int i, int j)
	{
		 char temp;
	        char[] s1 = a.toCharArray();
	        temp = s1[i] ;
	        s1[i] = s1[j];
	        s1[j] = temp;
	       return String.valueOf(s1);
	}
	
	public static void permute(String a,int l,int r)
	
	{
		if(l==r)
			t.add(a);
		
		else
		{
			for(int i=l;i<=r;i++)
			{
			a=swap(a,l,i);
			permute(a,l+1,r);
			a=swap(a,l,i);
			
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
	
		int n=s.length();
		permute(s,0,n-1);
		Iterator e= t.iterator();
		ArrayList al=new ArrayList();
		Collections.sort(al);
	      String s3;
	        while(e.hasNext())
	        {
	        	al.add(e.next());
	            
	        }
	        int count=0;
	        //System.out.print(al);
	        for(int i=0;i<al.size();i++)
	        {
	         int n1=Integer.parseInt(s);
	         int n2=Integer.parseInt((String) al.get(i));
	        	if(n2>n1)
	        		{
	        		 System.out.print(n2);
	        		count=count+1;
	        		break;
	        	}//if
	        	
	         
	       }//for
	        if(count==0)
	        	System.out.print("impossible");
	       
	        	
	}//main
	
}//class
