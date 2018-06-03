package JUNE;

import java.util.Scanner;

public class hunter55 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int a[];
		int n=scan.nextInt();int k=scan.nextInt();
		a=new int[n];
		String s3="";
		StringBuffer sb=new StringBuffer(s3);
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
			sb.append(a[i]+" ");
		}
		//System.out.print(sb.toString());
		 String s2 = null;
		for(int i=0;i<k;i++)
		{
		   s2= sb.append(sb.charAt(0)).deleteCharAt(0).toString();
		}
		System.out.print(s2);

	}

}
