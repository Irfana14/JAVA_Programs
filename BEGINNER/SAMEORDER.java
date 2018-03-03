import java.util.Scanner;
class S
{
	String s;
	Scanner scan=new Scanner(System.in);
	int n,n1,n2;
	void getd()
	{
		 s=scan.nextLine();
		 n=s.length();
		 n1=scan.nextInt();
		 n2=n-n1;
		 //System.out.print(n2);
		 char[] a=s.toCharArray();
		  for(int i=n2;i<s.length();i++)
			  System.out.print(a[i]);
		
	}
}
public class sameorder 
{

	public static void main(String[] args) 
	{
		
		S p=new S();
		p.getd();
	}

}
