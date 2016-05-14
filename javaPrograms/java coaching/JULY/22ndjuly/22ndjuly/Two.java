class Employee
{
}

class Manager 
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


class Two
{
public static void main(String args[])
{
A  obj=new B();
obj.display();
}

}
