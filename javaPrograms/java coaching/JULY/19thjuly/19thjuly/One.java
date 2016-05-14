class A
{
//overridden
void display()
{
System.out.println("Hi This is display in A");
}

}
class B extends A
{
//overriding

void play()
{
System.out.println("Hi this is play in B");
}

}


class One
{
public static void main(String args[])
{
B obj=new B();
obj.play();
}

}
