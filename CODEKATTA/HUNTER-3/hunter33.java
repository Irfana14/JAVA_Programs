package JUNE;

import java.util.Scanner;

public class hunter33 
{

	public static void main(String[] args) 
	{
		String s1,s3="";
		String s2="";
		StringBuffer sb=new StringBuffer(s2);
       Scanner scan=new Scanner(System.in);
       String s=scan.nextLine();
      
       for(int i=0;i<s.length();i++)
       {
    	   int k=i+2;
    	   if(k<=s.length())
    	     {
    		   s1=s.substring(i,k);
    		   	if(s1.equalsIgnoreCase("ab")||s1.equalsIgnoreCase("ba"))
    	          {
    		   s3=sb.append(s1).toString();
    		   	
    	           }
    	        else
    		      {sb.delete(0,s3.length());
    		   	  i=i+1;}
    	   }
    	   else
    		   break;
    	   
       }	   
       if(s3.length()!=0)
       {
    	   int n=s3.length()/2;
       System.out.print(n+1);
       }
       else
    	   System.out.print(0);
	
       
       
       
 
	}

}
