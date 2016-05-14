class A
{

	class B
	{	
	int n=10;
	}


void one()
{
B obj=new B();
System.out.println("obj.n is "+obj.n);
}

}

class Eight
{
public static void main(String args[])
{
A temp=new A();
temp.one();
}

}
