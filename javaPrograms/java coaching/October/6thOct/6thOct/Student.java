import java.io.*;

class Student implements Serializable
{
private int roll;
private String name;
private static String schoolName;

Student(int roll,String name,String schoolName)
{
this.roll=roll;
this.name=name;
this.schoolName=schoolName;
}

public int getRoll()
{
return roll;
}

public String getName()
{
return name;
}

public String getSchoolName()
{
return schoolName;
}




}
