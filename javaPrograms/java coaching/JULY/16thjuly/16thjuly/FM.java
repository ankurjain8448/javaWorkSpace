class A
{

private int n;

private A(int n)
{
this.n=n;
}

public static A getA(int n)
{
A obj=new A(n);
return obj;
}


void display()
{
System.out.println(n);
}
}

class FM
{
public static void main(String args[])
{
A obj=A.getA(Integer.parseInt(args[0]));
obj.display();

}

}
