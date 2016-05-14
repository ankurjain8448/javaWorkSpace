class B
{
int num;
}

class A
{

B one()
{
B obj=new B();
obj.num=765;
return obj;
}

}


class Seventeen
{
public static void main(String args[])
{
A a1=new A();

B b1=a1.one();

System.out.println(b1.num);

}

}