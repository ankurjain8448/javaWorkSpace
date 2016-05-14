class A
{
int n;
}

class Two
{
public static void main(String args[])
{
A obj1=new A();
obj1.n=45;

A obj2=new A();
obj2.n=78;

obj1=obj2;
System.out.println(obj1.n);
System.out.println(obj2.n);

}

}
