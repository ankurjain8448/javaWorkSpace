class A
{
void display()
{System.out.println("In A");}
}

class B extends A
{
void display()
{System.out.println("In B");}
}



class Binding_Dynamic
{
public static void main(String args[])
{
A obj = new B();
obj.display();	// Method call is choosen at runtime..obj stores the reference of B class....so display of class B is called here..

A obj1 = new A();
obj1.display();

B obj2 = new B();
obj2.display();

}
}