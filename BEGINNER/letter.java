import java.util.Scanner;
class Num
{
	Scanner scan=new Scanner(System.in);
	int n;
	char letter;
	void getd()
	{
	     n=scan.nextInt();
		
		letter=(char)(n+64);
		System.out.print(letter);
		
		    
		    
		}

}
public class numchar 
{

	
	public static void main(String[] args)
	{
		Num p=new Num();
		p.getd();

	}

}
