import java.io.*;


//Serialization

class S6
{
public static void main(String args[]) throws IOException
{

Car c1=new Car("RollsRoyce");
Employee e1=new Employee("Peter",c1);
Company cmp1=new Company("HT",e1);

FileOutputStream fos=new FileOutputStream(args[0]);
ObjectOutputStream oos=new ObjectOutputStream(fos);

oos.writeObject(cmp1);

fos.close();
oos.close();

}

}
