import java.util.Scanner;
class Num2
{
	Scanner scan=new Scanner(System.in);
	int n1;
	char letter1;
	void getd()
	{
	     n1=scan.nextInt();
		
		letter1=(char)(n1+64);
		System.out.print(letter1);
		
		    
		    
		}

}
public class numchar 
{

	
	public static void main(String[] args)
	{
		Num2 p1=new Num2();
		p1.getd();

	}

}
