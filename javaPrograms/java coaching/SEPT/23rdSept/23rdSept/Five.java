import java.io.*;

class Five
{
public static void main(String args[]) throws IOException
{
FileInputStream fis=new FileInputStream(args[0]);

int k=0;

while((k=fis.read())!=-1)
{
System.out.print((char)k);
}


fis.close();

}

}
