//covariant return type

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
System.out.println("Krishna in A");
return new Employee();
}

}
class B extends A
{
Manager display()
{
System.out.println("Radha in B");
return new Manager();
}

}


class One
{
public static void main(String args[])
{
A  obj=new B();
obj.display();
}

}
