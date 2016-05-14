class A
{
int n=10;
}
class B extends A
{
int n=20;
}


class Six
{
public static void main(String args[])
{
A  obj=new B();
System.out.println(obj.n);

}

}
