class A
{

void display()
{
System.out.println("Hello ");
}

}

class B extends A
{
void play()
{
display();
System.out.println("Hi ");
}


}

class I4
{
public static void main(String args[])
{
B obj=new B();
obj.play();
}

}


