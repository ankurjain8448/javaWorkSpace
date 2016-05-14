class A
{

public void finalize()
{
System.out.println("nothing...");
}

}

class N4
{
public static void main(String args[])
{
new A();
new A();
new A();

System.gc();

}

}

























