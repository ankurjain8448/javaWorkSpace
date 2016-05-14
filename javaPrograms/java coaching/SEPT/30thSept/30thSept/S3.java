import java.io.*;


//DeSerialization

class S3
{
public static void main(String args[]) throws IOException,ClassNotFoundException
{
FileInputStream fis=new FileInputStream(args[0]);

ObjectInputStream ois=new ObjectInputStream(fis);

Student obj[]=(Student[])ois.readObject();

for(Student st:obj)
{
System.out.print(st.getRoll()+"\t");
System.out.println(st.getName());
}


fis.close();
ois.close();

}

}
