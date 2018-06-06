package JUNE;

import java.util.Scanner;

public class hunter64 
{
	public static void main(String[] args)
	{
		int m,r;
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        int n1=(Integer.parseInt(s));
        int n=s.length();
        int count=0;
        	while(n1>=1000)
        	{
        	n1=Math.abs(n1-1000);
        	count=count+1;
        	
        	}
        	while(n1>=500)
        	{
        	  n1=Math.abs(n1-500);	
        	  count=count+1;
        	}
        	while(n1>=100)
        	{
        		 n1=Math.abs(n1-100);	
           	     count=count+1;
        	}
        	while(n1>=50)
        	{
        		n1=Math.abs(n1-50);	
        		count=count+1;
        		
        	}
        	if(n1>=10)
        	{
        		m=n1%10;
        		r=n1/10;
        		count=count+m+r;
        		
        	}
        	if(n1<10)
        	{
        		count=count+n1;
        	}
        	
        System.out.print(count);
        

	}

}
