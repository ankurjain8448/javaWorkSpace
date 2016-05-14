package xtra;
import java.util.*;

public class rishCodechefProgram {

	/**
	 * @param args
	 */
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = in.nextInt();
for(int p = 0;p<t;p++)
{
		
		String A = in.nextLine();
		String B= in.nextLine();
		int l1 = A.length();
		int l2 = B.length();
		if(l1<l2)
		{
				String temp= A;
				A = B;
				B = temp;
				
				l1 = l1+l2;
				l2= l1-l2;
				l1 = l1-l2;
		}
		int a[] = new int[123];
			
		for(int i = 0;i<l1;i++)
		{
			a[(int)A.charAt(i)]++;
		}
		int sum=0;
		for(int i = 0;i<l2;i++)
		{
			if(a[(int)B.charAt(i)] > 0)
			{
				sum++;
				a[(int)B.charAt(i)]--;
			}
		}
		
		System.out.println(sum);
		
	}
	}
}
