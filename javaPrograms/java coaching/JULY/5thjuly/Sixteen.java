class B
{
int num;
}

class A
{

int one()
{
return (int)5.7;
}


double five()
{
return 5;
}

double seven()
{
return "5";
}


}


class Fifteen
{
public static void main(String args[])
{
B b1=new B();
System.out.println(b1.num);

A a1=new A();
a1.one(b1);

System.out.println(b1.num);

}

}


