package Programs;

public class String_Interleaving {


	public static void main(String[] args) {

		String s1= "aac";
		String s2 = "aab";
		String result = "aacaab";
		int length = result.length();
		int temp1 = 0;
		int temp2 = 0;
		if(result.length()!=(s1.length()+s2.length())){
			System.out.println(" Strings are not interleaving");
			System.exit(0);}
			else
			{
				int i=0,j=0,k=0;
				// i for s1, j for s2,k for result
				while(k<length)
				{
					
					System.out.println(" String");
					if(s1.charAt(i)==result.charAt(k)) 
					{
						i++;
						if(i==(s1.length()-1)) {temp1 = i;s1=" ";}
					}
					else {
							if(s2.charAt(j)==result.charAt(k)){
								j++;
								if(j==(s2.length()-1)) {temp2 = j;s2=" ";}
							}
							
							
							}
						}
					k++;
					}
				if((temp1 == s1.length())&&(temp2 == s2.length()))
				{
					System.out.println(" Strings are interleaving");
				}
				else System.out.println(" Strings are not interleaving");
				
			}
		
		

	}
