import java.util.Scanner;
class c1
{
	Scanner scan=new Scanner(System.in);
	int a[];
	
	void getd()
	{
		int n=scan.nextInt();
		a=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			a[i]=scan.nextInt();
			//System.out.print(a[i]);
		}
		
		for(int i=1;i<=n;i++)
			{
			if(a[i]==i)
				continue;
			else
				System.out.print(i);
			}
		
		
}
	
}
public class changenum 
{

	public static void main(String[] args) 
	{
		c1 p=new c1();
		p.getd();
		

	}

}
