//Accept a sentence & display the sentence in alphabetical order.
import java.util.*;
class Assignment_String5
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("Enter any string ");
String s=in.nextLine();
int i=0;

int a[] = new int[s.length()];
for(i=0;i<s.length();i++)
a[i]=(int)(s.charAt(i));

Arrays.sort(a);

for(i=0;i<s.length();i++)
System.out.print((char)a[i]);
}
}

