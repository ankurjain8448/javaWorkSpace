import java.io.*;

class Student implements Serializable
{
private int roll;
private String name;
private transient int total;

Student(int roll,String name,int total)
{
this.roll=roll;
this.name=name;
this.total=total;
}

public int getRoll()
{
return roll;
}

public String getName()
{
return name;
}


public int getTotal()
{
return total;
}


}
