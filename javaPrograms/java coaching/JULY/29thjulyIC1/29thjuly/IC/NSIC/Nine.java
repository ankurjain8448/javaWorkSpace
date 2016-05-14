class A
{

	class B
	{	
	int n=10;
	}


B obj=new B();

void one()
{
System.out.println("This is one ");
System.out.println("obj.n is "+obj.n);
}

void two()
{
System.out.println("This is two ");
System.out.println("obj.n is "+obj.n);
}


}

class Nine
{
public static void main(String args[])
{
A temp=new A();
temp.one();
temp.two();
}

}
