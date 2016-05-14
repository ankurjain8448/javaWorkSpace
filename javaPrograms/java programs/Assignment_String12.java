/*Accept a word & display the following design:-
eg-bhavani
bhavani
bhavan
bhava
bhav
bha
bh
b
*/
import java.util.*;
class Assignment_String12
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("Enter any string ");
String s=in.nextLine();
int j=s.length();
int k=0;
{for(int i=0;i<j;i++)
{for(k=0;k<j-i;k++)
System.out.print(s.charAt(k));
System.out.println("");
}}
}
}