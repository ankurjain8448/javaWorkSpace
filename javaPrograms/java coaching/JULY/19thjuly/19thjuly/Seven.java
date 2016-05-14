class Employee
{
}
class Manager extends Employee
{
}

class A
{

Employee display()
{
System.out.println("A");
return new Employee();
}

}
class B extends A
{

Manager display()
{
System.out.println("Bee");
return new Manager();
}

}


class Seven
{
public static void main(String args[])
{
new B().display();
}

}


