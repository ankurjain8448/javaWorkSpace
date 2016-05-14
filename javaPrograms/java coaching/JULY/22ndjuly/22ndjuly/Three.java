class A
{

private void display()
{
System.out.println("display in A");
}

}
class B extends A
{

void display()
{
System.out.println("display in B");
}

}


class Three
{
public static void main(String args[])
{
A  obj=new B();
//obj.display();

}

}
