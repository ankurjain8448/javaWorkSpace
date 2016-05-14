class B
{int num;}

class A
{
void one(B obj)
{obj.num=68;}
}


class Method1
{
public static void main(String args[])
{
B b1= new B();
System.out.println(b1.num);

A a1=new A();
a1.one(b1);//<--- Passing obj as a argument
System.out.println(b1.num);

}
}
