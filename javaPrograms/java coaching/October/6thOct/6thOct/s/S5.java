import java.io.*;


//DeSerialization

class S5
{
public static void main(String args[]) throws IOException,ClassNotFoundException
{
FileInputStream fis=new FileInputStream(args[0]);

ObjectInputStream ois=new ObjectInputStream(fis);

Object obj=ois.readObject();

fis.close();
ois.close();

}

}
