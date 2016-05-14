import java.util.*;

//palindrome solution another way

class Two
{
public static void main(String args[])
{

long l1=System.nanoTime();

String original=args[0];
boolean flag=false;


for(int k=0,l=original.length()-1;k<original.length()/2;k++,l--)
{
char ch1=original.charAt(k);
char ch2=original.charAt(l);

if(ch1!=ch2)
{
flag=true;
break;
}

}

if(!flag)
System.out.println(original+" is a palindrome");
else
System.out.println(original+" is not a palindrome");

long l2=System.nanoTime();

System.out.println(" Time taken for Execution="+(l2-l1));

}

}
