class SB4
{
public static void main(String args[])
{
String name1=args[0];

StringBuffer sb=new StringBuffer(name1);
sb.reverse();

//String name2=sb.toString();

String name2=new String(sb);

if(name1.equals(name2))
System.out.println(name1+" is a palindrome ");
else
System.out.println(name1+" is not a palindrome ");



}

}
