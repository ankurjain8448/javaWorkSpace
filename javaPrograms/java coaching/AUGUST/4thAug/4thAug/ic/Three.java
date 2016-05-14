class A
{

class B
{

void display()
{
System.out.println("Vishnu");
}

}

}

class Three extends A.B
{

Three(A obj)
{
obj.super();
}

public static void main(String args[])
{
A temp=new A();
Three obj=new Three(temp);
obj.display();
}

}
