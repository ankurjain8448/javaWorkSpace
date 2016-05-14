import java.io.*;


class RAF2
{
public static void main(String args[]) throws IOException
{
RandomAccessFile raf=new RandomAccessFile(args[0],"rw");

raf.writeInt(45);
raf.writeInt(786);
raf.writeInt(99);
raf.writeInt(5);
raf.writeInt(8);
raf.writeInt(7);


raf.close();


}

}

