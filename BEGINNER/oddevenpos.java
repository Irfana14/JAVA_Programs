package ZOHO;
import java.util.Scanner;
class O1
{
	Scanner scan=new Scanner(System.in);
	int n,k=0,t=0;
	String s;
	String s1="";
	String s2="";
	StringBuffer sb=new StringBuffer(s1);
	StringBuffer sb1=new StringBuffer(s2);
	void getd()
	{
		s=scan.nextLine();
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		   {if(i%2==0)
			sb.append(a[i]);
		   else
			  sb1.append(a[i]);
		   }//for
		System.out.print(sb+" ");
		
		System.out.print(sb1);
		
		
	}//getd
}
public class oddeven 
{

	
	public static void main(String[] args) 
	{
		O1 p=new O1();
		p.getd();

	}

}
