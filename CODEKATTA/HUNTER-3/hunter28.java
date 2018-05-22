package JUNE;

import java.util.Scanner;

public class hunter28
{

	public static void main(String[] args) 
	{
		int count[];
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		char a[]=s.toCharArray();
		count=new int[a.length];
		for(int i=0;i<a.length;i++)
			count[i]=count[i]+1;
		for(int i=0;i<(a.length-1);i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					{
					count[i]=count[i]+1;
				    a[j]='*';
					}
			}
		}
		
for(int i=0;i<count.length;i++)
	{if(count[i]>0&&a[i]!='*')
		System.out.print(a[i]);
	}
	}

}
