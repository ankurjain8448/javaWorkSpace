class Car
{
String name;
}

class Employee
{
String ename;
Car car=new Car();
}

class Two
{
public static void main(String args[])
{
Employee emp=new Employee();
emp.ename="Peter";
emp.car.name="BMW";

System.out.println(emp.ename);
System.out.println(emp.car.name);

}

}
