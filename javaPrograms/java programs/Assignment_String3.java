//Accept a sentence & reverse the order of words
import java.util.Scanner;

class Assignment_String3
{
public static void main(String args[])
{
System.out.println("Enter any string :");
Scanner in = new Scanner(System.in);
String a=in.nextLine();
int count=0,j=0,flag=0;
for(int i=0;i<a.length();i++)
{
if(a.charAt(i)==' ')
{
for(j=i-1;j>=count;j--)
System.out.print(a.charAt(j));
count = i;
if(flag==0)
System.out.print(" ");
flag++;
}
 
}
}
}