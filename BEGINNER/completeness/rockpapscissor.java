package CODEKATTAA;
import java.util.Scanner;
class rocksispap
{
	String str;
	void getd()
	{
		Scanner scan=new Scanner(System.in); 
		str=scan.nextLine().toLowerCase().replace(" ", "");
		char a[]=str.toCharArray();
		/*for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
		System.out.print(a.length);*/
		for(int i=0;i<(a.length-1);i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]=='r' && a[j]=='p')
			{
				System.out.print("P");
			}
			if(a[i]=='s' && a[j]=='p')
			{
				System.out.print("S");
			}
			if(a[i]=='r' && a[j]=='s')
			{
				System.out.print("R");
			}
			}
		}
			
	
	}
}

public class rockpapscis 
{
	public static void main(String[] args) 
	{
		rocksispap p=new rocksispap();
		p.getd();

	}

}
