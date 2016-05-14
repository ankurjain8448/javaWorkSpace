package Programs;
import java.util.*;
public class factorial {

	static Scanner in= new Scanner(System.in);
	public static void main(String[] args) {
		int t = in.nextInt();
		for(int i = 0;i<t;i++) 
			{
			int s = 1;
			int p = in.nextInt();
			
			for(int i1 =2;i1<=p;i1++)
				s =s*i1;
			System.out.println(s);
			}

	}
	
}
