class A
{

A(int k)
{
this();
System.out.println("this is SP "+k);
}

A()
{
System.out.println("this is NP ");
}

A(int n,int m)
{
this(n+m);
System.out.println("this is DP ");
}

}

class CC
{
public static void main(String args[])
{
new A(10,20);

}

}
