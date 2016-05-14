package Programs;
import java.util.*;
public class Adding_Binary_Strings {

	private static Scanner in;
	public static void main(String[] args) {
	in = new Scanner(System.in);
	
	
	System.out.println(" enter 2 Strings : ");
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		String result = "";
		String xtra = "";
		char carry ='0';
		int lens1 = s1.length();
		int lens2 = s2.length();
		int temp = mod(lens1- lens2) ;
		for(int i1 = 0;i1<temp;i1++)
			xtra 	= xtra + "0";
		
		
		
		if(lens1 > lens2) s2 = xtra + s2; 
		else s1 = xtra + s1;
		
		
		for(int i1 =lens1-1;i1>=0;i1-- ){
			
			if(s1.charAt(i1)==s2.charAt(i1))
			{
				if(s1.charAt(i1) =='0')
				{
					if(carry=='0') result = '0' + result  ;
					else result = '1' + result  ;
				}
				if(s1.charAt(i1) =='1') 
				{
					if(carry=='0') result = '0' + result  ;
					else 	result = '1' + result  ; 
					
					carry = '1';
				}
			
			}
			else
			{
				if(carry=='0')	result = '1' + result;
				else
				{
					result = '0' + result;
					carry = '1';
				}
			}
		}
		result = carry + result;
		int length;
		if(result.length() > s1.length()) length = result.length();
		else length = s1.length();
		
		for(int p= 0;p<length;p++)
			System.out.print(result.charAt(p));
			}
	
	public static  int mod(int x)
	{
		if(x>0) return x;
		else return -x;
	}

}
