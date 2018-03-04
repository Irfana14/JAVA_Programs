import java.util.Scanner;
class P1
{
	String s;
	int product=1;
	Scanner scan=new Scanner(System.in);
	void getd()
	{
		s=scan.nextLine();
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		  product=product*(Character.getNumericValue(a[i]));
		System.out.print(product);
	}
}
public class productdigit 
{

	public static void main(String[] args) 
	{
       		P1 p=new P1();
       		p.getd();

	}

}
