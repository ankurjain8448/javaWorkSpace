class A
{

class B
{

B(int n)
{
System.out.println("In B n is"+n);
}

void display()
{
System.out.println("Vishnu");
}

}

}

class Four extends A.B
{

Four(A obj)
{
obj.super(38);// call to constructor of B
}

public static void main(String args[])
{
A temp=new A();
Four obj=new Four(temp);
obj.display();
}

}
