package codekatta1;
import java.util.*;
public class rotate 
{
	public static void main(String[] args)
	{
		int n;
		String s;
		Scanner scan=new Scanner(System.in);
		s=scan.nextLine();
		StringBuffer sb=new StringBuffer(s);
		n=scan.nextInt();
		if(n>=s.length())
			System.out.print(s);
		else
		{
		for(int i=0;i<n;i++)
		{
			sb.append(s.charAt(i));
			sb.deleteCharAt(0);
		}
		System.out.print(sb.toString());
		}
		
			
		

	}

}

