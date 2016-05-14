interface I1
{
int a=100;
int b=200;
int c=300;
int d=400;
}

class A implements I1 
{
}

class B implements I1 
{
}


class Twenty
{
public static void main(String args[])
{
A obj=new A();
System.out.println(obj.a+obj.b+obj.c+obj.d);
}
}
