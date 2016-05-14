class A
{

void display()
{
System.out.println("display in A");
}

}
class B extends A
{

}

class C extends B
{

void display()
{
System.out.println("display in C");
}

}



class Twenty1
{
public static void main(String args[])
{
B obj=new C();
obj.display();
}
}


