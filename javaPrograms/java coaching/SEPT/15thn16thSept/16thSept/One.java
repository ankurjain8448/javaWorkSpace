
//palindrome solution one way
class One
{
public static void main(String args[])
{

long l1=System.nanoTime();

String original=args[0];


String rev="";//empty String

for(int k=0;k<original.length();k++)
{
char ch=original.charAt(k);
rev=ch+rev;
}

if(original.equalsIgnoreCase(rev))
System.out.println(original+" is a palindrome");
else
System.out.println(original+" is not a palindrome");

long l2=System.nanoTime();

System.out.println(" Time taken for execution="+(l2-l1));
}

}
