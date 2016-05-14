// to check palindrome
import java.util.*;
class Assignment_String1
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("Enter any string ");
String s=in.nextLine();
int j=s.length();
int i=0;
if(j%2==0)
System.out.println("String is not palidrome");
else
{
for(i=0;i<j/2;i++)
{
if(s.charAt(i)!=s.charAt(j-i-1))
{System.out.println("String is not palidrome");
break;
}
}
if(i==j/2)
System.out.println("String is palidrome");
}
}
}

