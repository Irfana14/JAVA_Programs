package ZOHO;
import java.util.*;
public class negative 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
	   int a[];
	   int sum=0;
	   int flag=0;
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
			 flag=1;
		  }//if
	  }//for
	  if(flag==1)
	   System.out.print(sum);
	  else
	  System.out.print("0");
		 
	}//class

}//main
