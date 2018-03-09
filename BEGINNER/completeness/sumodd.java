import java.util.Scanner;


		
public class twoadd
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		
			a[i]=scan.nextInt();
			
		for(int i=0;i<n;i++)
			sum=sum+a[i];
		//System.out.print(sum);
		 if(sum%2==0)
			 System.out.print("even");
		 else
			 System.out.print("odd");


	}

}
