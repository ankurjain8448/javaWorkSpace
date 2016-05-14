import java.io.*;

class F3
{
public static void main(String args[]) 
{

File f1=new File(args[0]);


File f2[]=f1.listFiles();

for(File f3:f2)
f3.delete();

f1.delete();



/*
for(File f3:f2)
System.out.println(f3);
*/



/*
String str[]=f1.list();

for(String s:str)
System.out.println(s);
*/

}

}

