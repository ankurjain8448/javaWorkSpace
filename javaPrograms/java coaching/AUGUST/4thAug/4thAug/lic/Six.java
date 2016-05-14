interface I
{
void display();
}


class V
{

I one()
{

class A implements I
{

public void display()
{
System.out.println("PavanPutra Hanuman ki Jai!");
}

}

A temp=new A();
return temp;

}

}


class Six
{
public static void main(String args[])
{
V obj=new V();
I z=obj.one();

z.display();

}

}
