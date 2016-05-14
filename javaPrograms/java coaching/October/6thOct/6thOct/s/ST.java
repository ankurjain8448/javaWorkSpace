import java.io.*;


//Serialization

class ST
{
public static void main(String args[]) throws IOException
{
Student obj=new Student(10,"Martin",258);

FileOutputStream fos=new FileOutputStream(args[0]);
ObjectOutputStream oos=new ObjectOutputStream(fos);

oos.writeObject(obj);

fos.close();
oos.close();

}

}
