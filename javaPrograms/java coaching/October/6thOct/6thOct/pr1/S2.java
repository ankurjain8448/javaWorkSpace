import java.io.*;


//DeSerialization

class S2
{
public static void main(String args[]) throws IOException,ClassNotFoundException
{
FileInputStream fis=new FileInputStream(args[0]);

ObjectInputStream ois=new ObjectInputStream(fis);

Student obj=(Student)ois.readObject();

if(obj!=null)
{
System.out.println(obj.getRoll());
System.out.println(obj.getName());
System.out.println(obj.getSchoolName());
}
else
System.out.println("nothing");

fis.close();
ois.close();

}

}
