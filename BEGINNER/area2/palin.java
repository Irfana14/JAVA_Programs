package CODEKATTAA;
import java.util.*;
class P1
{
	Scanner scan=new Scanner(System.in);
	String s;
	void getd()
	{
	s=scan.nextLine();
	StringBuffer sb=new StringBuffer(s);
	String s1=sb.reverse().toString();
	if(s1.equals(s))
	
		System.out.print("yes");
	else
		System.out.print("no");
	
	}
	
}
public class palindrome
{

	public static void main(String[] args)
	{
		P1 p=new P1();
		p.getd();
	}

}
