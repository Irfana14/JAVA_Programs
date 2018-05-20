package JUNE;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class hunter16
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int a[];
		int n=scan.nextInt();int k=scan.nextInt();
		a=new int[n];
		ArrayList al=new ArrayList();
		int count=0;
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		for(int i=0;i<n;i++)
			{
			if(a[i]<k)
			{
				System.out.print(a[i]+" ");
				count=count+1;
			}
			if(a[i]>k)
				al.add(a[i]);
			}
		Collections.sort(al);
		for(int i=0;i<(3-(count));i++)
			
			System.out.print(al.get(i)+" ");
				
			
			
			

	}

}
