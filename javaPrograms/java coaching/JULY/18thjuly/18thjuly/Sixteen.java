class Dog
{

void say()
{
System.out.println("bow bow");
}

}
class Bird extends Dog
{

void say()
{
System.out.println("Kooo kooo");
}

}


class Sixteen
{
public static void main(String args[])
{
Bird bird=new Bird();
bird.say();
}

}


