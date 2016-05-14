class A
{
private A()
{
}

}

class B extends A
{

void display()
{
System.out.println("display in B");
}

}



class Eight
{
public static void main(String args[])
{
B  obj=new B();
obj.display();

}

}
