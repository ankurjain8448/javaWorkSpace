import java.io.*;


class RAF3
{
public static void main(String args[]) throws IOException
{
RandomAccessFile raf=new RandomAccessFile(args[0],"r");

long l=raf.length();

while(l>0)
{
System.out.println(raf.readInt());
l=l-4;
}

raf.close();
}

}

