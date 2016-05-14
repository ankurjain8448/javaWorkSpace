import java.io.*;

class Nine
{
public static void main(String args[]) throws IOException
{
FileInputStream fis=new FileInputStream(args[0]);

byte b[]=new byte[fis.available()];

fis.read(b);

String str=new String(b);

System.out.print(str);

fis.close();

}

}
