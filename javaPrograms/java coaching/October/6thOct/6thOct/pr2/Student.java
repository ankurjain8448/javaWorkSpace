import java.io.*;

class Student implements Serializable
{
static final long serialVersionUID = -994896985660174550L;


private int roll;
private String name;
private String busNo;

Student(int roll,String name)
{
this.roll=roll;
this.name=name;
}

public int getRoll()
{
return roll;
}

public String getName()
{
return name;
}



public String getBusNo()
{
return busNo;
}

}
