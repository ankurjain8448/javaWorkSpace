class Student
{
private int roll;
private String name;

Student(int roll)
{
this.roll=roll;
}

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

}


class One
{
public static void main(String args[])
{
Student obj1=new Student(5);
Student obj2=new Student(12,"Henry");

System.out.println(obj1.getRoll()+"\t"+obj1.getName());

System.out.println(obj2.getRoll()+"\t"+obj2.getName());

}

}
