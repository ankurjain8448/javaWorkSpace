import java.io.*;


class RAF1
{
public static void main(String args[]) throws IOException
{
RandomAccessFile raf=new RandomAccessFile(args[0],"rw");

raf.writeInt(45);
raf.writeInt(786);
raf.seek(4);
raf.writeInt(99);
//raf.seek(0);

raf.seek(2);

System.out.println(raf.readInt());
System.out.println(raf.readInt());

//System.out.println(raf.getFilePointer());

raf.close();


}

}

