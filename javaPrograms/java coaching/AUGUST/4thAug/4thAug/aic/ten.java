class A
{
void display()
{
System.out.println("New Delhi");
}

}


class B
{

A obj=new A()
{
void display()
{
System.out.println("New Arizona");
}

void five()
{
System.out.println("Los Angeles");
}


};

}


class Ten
{
public static void main(String args[])
{
B temp=new B();
temp.obj.display();
temp.obj.five();

}

}


