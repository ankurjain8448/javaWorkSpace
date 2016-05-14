import java.io.*;


class F4
{
public static void main(String args[]) 
{

File f1=new File(args[0]);

File f2[]=f1.listFiles(new EF(args[1]));

for(File f3:f2)
System.out.println(f3);

}

}



class EF implements FilenameFilter
{
String ext;

EF(String ext)
{
this.ext=ext;
}

public boolean accept(File dir,String str)
{
System.out.println("Hello there I m being called!");
return str.endsWith(ext);

}

}


