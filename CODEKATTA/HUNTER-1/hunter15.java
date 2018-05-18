import java.util.*;
class sum
{
	int a[];
	Scanner scan=new Scanner(System.in);
	
	
	void getd()
	{
		int sum=0;
	  int n1=scan.nextInt();//	size
	  a=new int[n1];
	  //int n2=scan.nextInt();//sum
	  for(int i=0;i<n1;i++)
	     a[i]=scan.nextInt();
	  for(int i=0;i<n1;i++)
	  {
		  sum=sum+a[i];
	  }//for
	  System.out.print(sum);
	}//getd
}//class


public class nsum

{


	public static void main(String[] args)
	
	{
		sum p=new sum();
		p.getd();

	}

}
