import java.io.*;


//Serialization

class S4
{
public static void main(String args[]) throws IOException
{
//Student obj[]=new Student[3];

Student obj[]={new Student(7,"Alex"),new Student(23,"John"),new Student(12,"Peter")};


FileOutputStream fos=new FileOutputStream(args[0]);
ObjectOutputStream oos=new ObjectOutputStream(fos);

oos.writeObject(obj);

fos.close();
oos.close();

}

}
