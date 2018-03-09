package ZOHO;

import java.util.Scanner;

public class ncoin 
{

	public static void main(String[] args) 
	{
		 int n,n1;
		 int a[];
		 a=new int[1];
		 Scanner scan=new Scanner(System.in);
		 n=scan.nextInt();//10
		 n1=scan.nextInt();//4
		 if(n%n1==0)
		 
			 System.out.print(n1);
		 else
		 { for(int i=1;i<=n;i++)
			 {
				 if(i%n1==0)
				 {
					 a[0]=i;
				 }
			 }
		 System.out.print(n-a[0]);
		 }
	}

}
