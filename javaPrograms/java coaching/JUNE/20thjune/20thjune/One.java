class A
{
int n=10;
int m=n+5;
//static int k=n; //error

static int k=35;
int h=k+5;
}


class One
{
public static void main(String args[])
{
A obj=new A();
System.out.println(obj.m);
System.out.println(obj.h);
}

}








