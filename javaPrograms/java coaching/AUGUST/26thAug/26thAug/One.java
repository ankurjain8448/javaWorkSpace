class A
{

public void finalize()
{
System.out.println("Vishnu...");
}

}

class One
{

static void test()
{
A obj=new A();
}

public static void main(String args[])
{

test();
int n=8;
System.gc();

}

}

























