class A
{
private int n;

A(int n)
{
this.n=n;
}


public boolean equals(Object obj)
{
A temp=(A)obj;

return n==temp.n;
}



}

class Three
{
public static void main(String args[])
{

A obj1=new A(5);
A obj2=new A(5);

System.out.println(obj1==obj2);
System.out.println(obj1.equals(obj2));

}

}
