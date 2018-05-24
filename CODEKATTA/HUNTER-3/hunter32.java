package JUNE;

import java.util.Scanner;

public class hunter32 
{

	public static void main(String[] args)
	{
		int a[];
            Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();
            a=new int[n];
            for(int i=0;i<n;i++)
            {
            	a[i]=scan.nextInt();
            }
            int b[]=new int[n];
            
            int t=0,s=0;
            for(int i=0;i<n;i++)
            {
            	if(i%2!=0)
            	{
            	   b[t++]=a[i];	
            	}
            	
            }
            int k=t;
            String s1="";
        StringBuffer sb=new StringBuffer(s1);
            for(int j=0;;j++)
        {
            	if(t!=1)
            	{ 
            		for(int i1=0;i1<t;i1++)
            		{ 
        		         if(i1%2!=0)
        		        	{
        		        	 t=0;
        		        	 b[t++]=b[i1];
        		        	sb.append(b[i1]); 
        		         }//if
        			}//for
            		
            	}//if
            	else
            		break;
        }//for
        int pos=0;
       for(int i=0;i<t;i++)
       {
    	   //System.out.print(b[i]);
    	   for(int i1=0;i1<n;i1++)
               {
    		   if(b[i]==a[i1])
    		   {
    			   pos=i1+1;
    			   System.out.print(pos);
    			   break;
    		   }
    		   
               }
       }
       
	}

}
