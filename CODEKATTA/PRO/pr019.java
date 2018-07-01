import java.util.Scanner;
import java.util.*;
public class ARRAYSUB_PRO
{
   public static void main(String args[])
   {
	   Scanner scan=new Scanner(System.in);
	   int n=scan.nextInt();
	   int a[]=new int[n];
	   for(int i=0;i<n;i++)
		   a[i]=scan.nextInt();
	   ArrayList al=new ArrayList();
	   for(int i=0;i<a.length;i++)
	   {
		   int m=a[i];
		   int count = 1;
		 
		  if(a[i]>0)
		  {
			   count=1;float x=(float) -1.0;
			  for(int j=i+1;j<a.length;j++)
			  {
				 
				  float t=Math.signum(a[j]);
				  if(t==x)
				  {
					  count=count+1;
				  }
				  else
					  break;
				  x= (x*-1);
			  }//for
			  al.add(count);
		  }//if
             	if(a[i]<0)
			  {
				   count=1;float x=(float) 1.0;
				  for(int j=i+1;j<a.length;j++)
				  {
					 
					  float t=Math.signum(a[j]);
					  if(t==x)
					  {
						  count=count+1;
					  }
					  else
						  break;
					  x= (x*-1);
				  }//for
				  al.add(count);
			  }//if
	   }//for
	      System.out.print(al);
   }//class
}//main
