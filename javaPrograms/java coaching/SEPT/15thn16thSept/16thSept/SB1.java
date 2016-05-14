class SB1
{
public static void main(String args[])
{
StringBuffer sb=new StringBuffer("mathematics");
System.out.println(sb.length());
System.out.println(sb.capacity());
sb.append("physics");
System.out.println(sb.length());
System.out.println(sb.capacity());
sb.append("chemistry");
System.out.println(sb.length());
System.out.println(sb.capacity());

sb.append("abc");
System.out.println(sb.length());
System.out.println(sb.capacity());

String w="";
for(int k=1;k<=27;k++)
w+="a";

sb.append(w);
System.out.println(sb.length());
System.out.println(sb.capacity());


}

}
