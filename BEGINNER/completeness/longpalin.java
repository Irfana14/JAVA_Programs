package CODEKATTAA;

import java.util.*;

public class longpalin 
{
 public static void main(String args[])
 {
    Scanner scan=new Scanner(System.in);
    String s=scan.nextLine();
    int a2[];
    String a1[] = null;
    a2=new int[20];
    a1=new String[20];
    int t=0,y=0;
    String s3 = null;
    int f = 0;
    char a[]=s.toCharArray();
    StringBuffer sb=new StringBuffer();
    StringBuffer sb1=new StringBuffer();
    for(int i=0;i<(a.length-1);i++)
    {
    	for(int j=i+1;j<a.length;j++)
    	{	if(a[i]==a[j])
    		{
    			f=j;
    			for(int k=i;k<=f;k++)
    				
    				 s3=sb.append(a[k]).toString();
    			     //System.out.print(s3+"\n");
    			     
    			     String s4=sb.reverse().toString();
    			     if(s3.equals(s4))
    			    	 {
    			    	  //System.out.print(s3+"\n");
    			    	  sb.delete(0,f+1);
    			    	  a1[t++]=s3;
    			    	  a2[y++]=s3.toCharArray().length;
    			    	 
    			    	  break;} 
    			         
    			     else
    			    	 {
    			    	 sb.delete(i,f);
    			    	 continue;}
    			     
			}//if
    	}//for		
    		
    	}//for
    
    
    int max=a2[0];
   for(int i=0;i<y;i++)
   {  if(a2[i]>max)
   {     max=a2[i];
           f=i;
   }
   
   }//for
   
   // System.out.print(max);
    for(int i=0;i<t;i++)
    {
          if(a1[i].length()==max)
        	  System.out.print(a1[i]);
    	
    	
    }
    //System.out.print(a1[max-1]);
    
    }//main
    
 }//class
 

