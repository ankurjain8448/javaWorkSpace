package PatternMatching;
import java.util.*;
public class Naive {

	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter text: ");
		String t = in.nextLine();
		System.out.println("enter pattern to be searched : ");
		String p = in.nextLine();
		int lt=t.length(); //length of string T
		int lp=p.length();//length of string P
		
		if(lt<lp){System.out.println("pattern doesnot exist"); System.exit(0);}
		
		int num = lt-lp+1;
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<lp;j++)
			{
				if(t.charAt(i)==p.charAt(j)) 
				{	i++;
					
				}
			}
		}
		
		
	}
	
	

}
