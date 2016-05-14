import java.util.*;
class anagram
{
public static void main(String r[])
{
String a = "1ab1ab";
String b = "bbaa1";
if(a.length()!=b.length())
{System.out.println("it is not what asked");
System.exit(0);}
else
{
int  l = a.length();
char a1[] = new char[l];
char b1[] = new char[l];
for(int i =0;i<l;i++)
{
a1[i] =a.charAt(i);
b1[i] = b.charAt(i);
}
Arrays.sort(a1);
Arrays.sort(b1);
int p=1;
for(int i = 0;i<l;i++)
{

if(a1[i] != b1[i])
{System.out.println("it is not what asked");
System.exit(0);}
else
p++;
if(p==l)
System.out.println("it is what asked");

}

}
}
}