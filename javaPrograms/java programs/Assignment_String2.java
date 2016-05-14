//Accept a sentence & display the words in new line.
import java.util.*;
class Assignment_String2
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("Enter any string ");
String s=in.nextLine();
int j=s.length();
for(int i=0;i<j;i++)
System.out.println(s.charAt(i));

}
}

