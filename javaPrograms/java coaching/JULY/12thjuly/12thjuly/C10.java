class Student
{
private int roll;
private String name;

Student(int roll,String name)
{
this.roll=roll;
this.name=name;
}

void display()
{
System.out.println("roll is "+roll);
System.out.println("name is "+name);
}

}


class C10
{
public static void main(String args[])
{
Student obj=new Student(15,"Vishnu");
obj.display();

Student obj2=new Student(5,"Narayan");
obj2.display();


}

}
