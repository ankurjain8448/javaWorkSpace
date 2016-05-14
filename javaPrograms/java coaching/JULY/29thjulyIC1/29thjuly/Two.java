interface A
{
void display();
}


class AImpl implements A
{
 public void display()
{
System.out.println("Hanuman");
}

}

class Two
{
public static void main(String args[])
{
AImpl obj=new AImpl();
obj.display();
}

}
