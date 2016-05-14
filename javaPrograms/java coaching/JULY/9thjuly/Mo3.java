class C
{
}

class D
{
}


class A
{

void one(C c)
{
System.out.println("see");
}

void one(D d)
{
System.out.println("dee");
}


}


class Mo3
{
public static void main(String args[])
{
A obj=new A();
obj.one(new C());
obj.one(new D());
obj.one(null);

}
}
