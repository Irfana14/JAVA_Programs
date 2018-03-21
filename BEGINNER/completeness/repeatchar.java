package geeks;
import  java.io.*;
import java.util.Scanner;
class z
{
	Scanner scan=new Scanner(System.in);
	int count=0;
	void getd()
	{
		String s=scan.nextLine().toLowerCase();
		
		char[]a=s.toCharArray();
		int n=s.length();
		for(int i=0;i<(n-1);i++)
		{
			for(int j=(i+1);j<n;j++)
			 {  
				 if(a[i]==a[j])
			    {
				   a[j]='*';
			    }//if
			 }//for
		}//for
	for(int i=0;i<n;i++)
		System.out.print(a[i]);
	
	for(int i=0;i<n;i++)
		
		if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
		
		    count=count+1;
	
        System.out.print("\n"+count);		
	
			
	
		
	}

}

		
public class VOWELCOUNT 
{

	
	public static void main(String[] args) 
	{
		
  z p=new z();
  p.getd();
	}

}
