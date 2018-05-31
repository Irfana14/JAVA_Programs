package JUNE;

import java.util.ArrayList;
import java.util.Scanner;

public class hunter46n 
{

	public static void main(String[] args)
	{
		int a[],count[];
         Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();
         a=new int[n];
         for(int i=0;i<n;i++)
        	 a[i]=scan.nextInt();
       	
         count=new int[n];
         int sum1 = 0,sum2 = 0;
         for(int i1=0;i1<n;i1++)
        	 count[i1]=0;
         for(int i=0;i<n;i++)
         { 
              sum1=sum1+a[i];
             for(int j=i+1;j<n;j++)
                {
            	
                sum2=sum2+a[j];
                }
             int n1=Math.abs(sum1-sum2);
             count[i]=n1;
             sum2=0;
         }
         int pos = 0;
         int min=count[0];
             for(int i=0;i<count.length;i++)
            	{if(count[i]<min)
            		min=count[i];
                     pos=i;
            	}
        
           int n2=(pos-1)-(n-(pos-1));
           System.out.print(n2);
         	 
         
         
         
         

	}

}
