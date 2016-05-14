class A
{

void display()
{
System.out.println("display in A");
}

}
class B extends A
{
void display()
{
System.out.println("display in B");
}

}
class C extends B
{
void display()
{
System.out.println("display in C");
}

}

class D extends A
{
void display()
{
System.out.println("display in D");
}

}

class E extends A
{

}


class V
{
void one(D obj)
{
obj.display();
}

}



class Twenty2
{
public static void main(String args[])
{
D d=new D();

//E e=new E();

//C c=new C();

//B b=new B();

A a=new A();

V v=new V();

//v.one(d);
//v.one(e);
//v.one(c);

//v.one(b);
v.one(a);

}
}


