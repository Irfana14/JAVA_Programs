package JUNE;

import java.util.Scanner;

public class hunter60 
{

	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	int k=scan.nextInt();
	int a[],b[];
	a=new int[k];b=new int[k];
	for(int i=0;i<k;i++)
		a[i]=scan.nextInt();
	for(int i=0;i<k;i++)
		b[i]=scan.nextInt();
	int val=b[0];
	
	
	for(int i=0;i<k;i++)
		{
		if(val==a[i])
		{System.out.print(i);
		  break;}
		  }
	
	}

}
