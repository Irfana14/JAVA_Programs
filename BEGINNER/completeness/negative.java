package ZOHO;
import java.util.*;
public class negative 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
	   int a[];
	   int sum=0;
	   int n=scan.nextInt();
	   a=new int[n];
	   for(int i=0;i<n;i++)
	   {
		   a[i]=scan.nextInt();
	   }
	  for(int i=0;i<a.length;i++)
	  {  if(a[i]<0)
		  {
			 sum=sum+a[i]; 
		  }//if
	  }//for

	  System.out.print(sum);
	}//class

}//main
