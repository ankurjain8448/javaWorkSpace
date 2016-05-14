class A
{
public void finalize()
{
System.out.println("I m no more...");
}

}

class N2
{
public static void main(String args[])
{
A obj=new A();
obj=new A();

System.gc();

}

}

























