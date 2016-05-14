class SB5
{
public static void main(String args[])
{
String name1=args[0];

StringBuffer sb=new StringBuffer(name1);
sb.reverse();

if(name1.contentEquals(sb))
System.out.println(name1+" is a palindrome ");
else
System.out.println(name1+" is not a palindrome ");



}

}
