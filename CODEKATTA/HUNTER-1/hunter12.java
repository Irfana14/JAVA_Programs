package JUNE;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class hunter12 {

	public static void main(String[] args) 
	{int n,a[],k;
	Scanner scan=new Scanner(System.in);
	n=scan.nextInt();
	k=scan.nextInt();
	ArrayList  al=new ArrayList();
	a=new int[n];
	for(int i=0;i<n;i++)
	{
	a[i]=scan.nextInt();
	al.add(a[i]);
	}
   Collections.sort(al);
   System.out.print(al.get(k-1));
	
	
	
	
	}

}
