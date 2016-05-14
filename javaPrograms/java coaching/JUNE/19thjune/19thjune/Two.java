class A
{
int n;
static int m;
}

class Two
{
public static void main(String args[])
{
A obj1=new A();
obj1.n=5;
obj1.m=20;

A  obj2=new A();
obj2.n=50;
obj2.m=30;

A  obj3=new A();
obj3.n=100;
obj3.m=A.m+obj1.m-obj2.m;

System.out.println("obj1.n="+obj1.n);
System.out.println("obj1.m="+obj1.m);
System.out.println("obj2.n="+obj2.n);
System.out.println("obj2.m="+obj2.m);
System.out.println("obj3.n="+obj3.n);
System.out.println("obj3.m="+obj3.m);










}

}
