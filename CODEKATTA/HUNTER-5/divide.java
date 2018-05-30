package JUNE;

import java.util.Scanner;

public class hunter50 
{

	public static void main(String[] args)
	{
		long n1,count=0;
		 Scanner scan=new Scanner(System.in);
		 long n=scan.nextInt();long k=scan.nextInt();
		 long m=n;
		 while(n>0)
		 {
			if(m<k)
			{	count=0;
			break;}
			
			 n1=n-k;
			 n=n1;
			 count=count+1;
			 
		 }
		 System.out.print(count);

	}

}
