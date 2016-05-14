import java.io.*;


//Serialization

class S7
{
public static void main(String args[]) throws Exception
{



FileInputStream fis=new FileInputStream(args[0]);
ObjectInputStream ois=new ObjectInputStream(fis);

Company cmp1=(Company)ois.readObject();


Employee e1=cmp1.getEmployee();

Car c1=e1.getCar();

System.out.println("Company is "+cmp1.getName());
System.out.println("Employee is "+e1.getName());
System.out.println("Car is "+c1.getName());

fis.close();
ois.close();

}

}
