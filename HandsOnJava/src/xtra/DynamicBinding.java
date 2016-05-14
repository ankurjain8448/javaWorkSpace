package xtra;

public class DynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj = new B();// di of b is called
obj.di();
System.out.println(obj.x);
	}

}

class A
{
	int x = 10;
	void di()
	{
		System.out.println("in a");
	}
}

class B extends A
{
	int x = 20;
	void di()
	{
		System.out.println("in b");
	}
}
