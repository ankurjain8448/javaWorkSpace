interface I1
{
void display();
}

interface I2 
{
void display();
}

class A implements I1,I2
{

public void display()
{
System.out.println("display in A");
}

}


class Ninteen 
{
public static void main(String args[])
{
A obj=new A();
obj.display();
}
}
