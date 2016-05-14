import java.io.*;


//Serialization

class S1
{
public static void main(String args[]) throws IOException
{
Student obj=new Student(25,"Alex");

FileOutputStream fos=new FileOutputStream(args[0]);
ObjectOutputStream oos=new ObjectOutputStream(fos);

oos.writeObject(obj);

fos.close();
oos.close();

}

}
