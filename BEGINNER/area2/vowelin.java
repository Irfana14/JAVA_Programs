package CODEKATTAA;
import java.util.*;
class V
{
	String s;
	char a[];
	void getd()
	{
		Scanner scan=new Scanner(System.in);
		char a1[]={'a','e','i','o','u','A','E','I','O','U'};
		int f=0;
		 s=scan.nextLine();
		 a=s.toCharArray();
		 /*for(int i=0;i<a.length;i++)
			 System.out.print(a[0]);*/
		 for(int i=0;i<a.length;i++)
		 { 
			 for(int j=0;j<a1.length;j++)
			 {
			 if(a[i]==a1[j])
			  { 
				  
				   f=1; 
			     	
			      }//if
			 }//for
		 }//for
		 
		 if(f==1)
			 System.out.print("yes");
		 else
			 System.out.print("no");
		
	}//getd
	
	
	
	
}//class
	 
public class vowelin 
{

	public static void main(String[] args)
	{
		
V p=new V();
p.getd();
	}

}
