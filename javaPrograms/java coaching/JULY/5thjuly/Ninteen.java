class A
{


void sum(int n,int m)
{
System.out.println("Int");
System.out.println(n+m);
}


void sum(double n,double m)
{
System.out.println("double");
System.out.println(n+m);
}

}


class Ninteen
{
public static void main(String args[])
{
A a1=new A();
a1.sum(2.0,3.0);

a1.sum(23,17);
}

}


