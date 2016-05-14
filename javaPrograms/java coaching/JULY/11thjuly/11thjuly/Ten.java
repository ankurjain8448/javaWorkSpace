class Student
{
int roll;
String name;

Student(int r,String n)
{
roll=r;
name=n;
}

void display()
{
System.out.print(roll+" ");
System.out.println(name);
}

}

class Ten
{
public static void main(String args[])
{
Student obj[]=new Student[5];


obj[0]=new Student(15,"Krishna");
obj[1]=new Student(1,"Govind");
obj[2]=new Student(1,"Gopal");
obj[3]=new Student(7,"Hari");
obj[4]=new Student(9,"Murari");

/*
obj[4].display();
obj[3].display();
obj[1].display();
obj[2].display();
obj[0].display();



for(int k=0;k<obj.length;k++)
obj[k].display();
*/


for(Student std:obj)
std.display();

}


}