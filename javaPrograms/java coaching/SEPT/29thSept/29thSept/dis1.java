import java.io.*;


class DIS1
{
public static void main(String args[]) throws IOException
{
FileInputStream fis=new FileInputStream(args[0]);
DataInputStream dis=new DataInputStream(fis);


while(dis.available()>0)
{
int r=dis.readInt();
String n=dis.readUTF();
boolean b=dis.readBoolean();

System.out.print(r+"\t");
System.out.print(n+"\t");
System.out.println(b);

}

dis.close();
fis.close();

}

}

