import java.util.Scanner;
class R
{
	Scanner scan=new Scanner(System.in);
	StringBuffer sb;
	StringBuffer s1;
	void getd()
	{
		   String s=scan.nextLine();
	       sb=new StringBuffer(s);
		   s1=sb.reverse();
		   System.out.print(s1);
		
	}
}
public class reverse {

	
	public static void main(String[] args) {
		R p=new R();
		p.getd();  

	}

}
