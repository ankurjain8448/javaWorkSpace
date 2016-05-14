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


class C extends A
{

void display()
{
System.out.println("display in C");
}

}

class D extends B
{

void display()
{
System.out.println("display in D");
}

}

class E
{

void one(A obj)
{
obj.display();
}

}

class V extends A
{
void display()
{
System.out.println("Vishnu");
}

}


class Ten
{
public static void main(String args[])
{
E e=new E();

V v=new V();
e.one(v);



}

}

