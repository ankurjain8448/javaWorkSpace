interface I
{
void display();
}

class A 
{
 public void display()
{
System.out.println("Bajrang Bali");
}
}

class B extends A implements I
{

}




class One
{
public static void main(String args[])
{
B obj=new B();
obj.display();
}

}
