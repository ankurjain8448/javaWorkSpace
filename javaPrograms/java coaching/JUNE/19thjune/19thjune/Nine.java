class A
{
int n; //non-static

void display()
{
System.out.println("Inside display "+this);
}

static void one()
{
//System.out.println(this);
//System.out.println(n);

display();

}

}

class Nine
{
public static void main(String args[])
{
A obj1=new A();

System.out.println("In main ="+obj1);
obj1.display();

A obj2=new A();

System.out.println("In main ="+obj2);
obj2.display();

}
}
