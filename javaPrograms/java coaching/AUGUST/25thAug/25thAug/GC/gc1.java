class A
{
public void finalize()
{
System.out.println("A is no more...");
}

}


class GC1
{
public static void main(String args[])
{
A obj=new A();
}

}
