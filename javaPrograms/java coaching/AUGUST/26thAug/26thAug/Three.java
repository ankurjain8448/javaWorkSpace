class Employee
{

public void finalize()
{
System.out.println("Employee");
}

}


class Manager extends Employee
{

public void finalize()
{
super.finalize();
System.out.println("Manager");
}

}




class Three
{


public static void main(String args[])
{

new Manager();

System.gc();

}

}

























