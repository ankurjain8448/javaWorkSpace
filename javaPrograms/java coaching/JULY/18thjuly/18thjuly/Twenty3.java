class A
{
final int n;

A()
{
n=800;
}

A(int n)
{
this.n=n;
}

}

class Twenty3
{
public static void main(String args[])
{
A obj1=new A();
System.out.println(obj1.n);

A obj=new A(1500);
System.out.println(obj.n);
}

}


