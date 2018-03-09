package ZOHO;

import java.util.Scanner;

public class vowelconsonents {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String s1="";
		String s2="";
		String s3 = null,s4 = null;
		StringBuffer sb=new StringBuffer(s1);
		StringBuffer sb1=new StringBuffer(s2);
		String s=scan.nextLine();
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'||a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
			{
				s3=sb.append(a[i]).toString();
			}
			else
				s4=sb1.append(a[i]).toString();
		}
		
		System.out.print(s3+s4);
		

	}

}
