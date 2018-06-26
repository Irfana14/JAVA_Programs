package JUNE;
import java.util.Scanner;
import java.util.*;
public class player20 
{

	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int a[]=new int[n];
	ArrayList al=new ArrayList();
	ArrayList al2=new ArrayList();
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	int count=0;
	for(int i=0;i<(n-2);i++)
	{ 
		if((a[i]>a[i+1])&&(a[i+1]<a[i+2]))
			count=count+1;
		if((a[i]<a[i+1])&&(a[i+1]>a[i+2]))
			count=count+1;
	
	}//for
	if(count==(n-2))
		System.out.print("yes");
	else
		System.out.print("No");
	
	}
}
