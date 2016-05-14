package Programs;

public class Expression_Valdity {

	public static void main(String[] args) {
			// implementing using stack
		
		String s = "[2]";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)==']'||s.charAt(i)=='}' ||s.charAt(i)==')') count++;
		}
		
		char a[] = new char[count];
		
		if(s.charAt(0)!='[' && s.charAt(0)!='{' && s.charAt(0)!='(') {System.out.println(" invalid expression ");System.exit(0);}
		else
		{
			for(int i = 0;i<s.length();i++)
			{
				if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='(') {a[i]=s.charAt(i);}
				else if(s.charAt(i)==']' || s.charAt(i)=='}' || s.charAt(i)==')')
				{
					if(s.charAt(i)==s.charAt(i-1)) {a[i-1] =' '; }
					else {System.out.println(" invalid expression ");break;}
				}
			}
		}
		
	}

}
