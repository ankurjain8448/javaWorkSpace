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

class Eleven
{
public static void main(String args[])
{
Student obj[]=new Student[5];

obj[0]=new Student(15,"Krishna");
obj[1]=new Student(1,"Govind");

/*
System.out.println(obj[0]);
System.out.println(obj[1]);
System.out.println(obj[2]);
System.out.println(obj[3]);
System.out.println(obj[4]);
*/


obj[0].display();
obj[1].display();
obj[2].display();
obj[3].display();
obj[4].display();








}


}