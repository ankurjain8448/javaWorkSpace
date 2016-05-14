class A
{

void display()
{
System.out.println("display ");
}

}

class B extends A
{
void play()
{
System.out.println("play ");
}


}

class I5
{
public static void main(String args[])
{
B obj=new B();
obj.play();
obj.display();
}

}


