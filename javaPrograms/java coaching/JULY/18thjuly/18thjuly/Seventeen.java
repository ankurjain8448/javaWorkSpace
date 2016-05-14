class Animal
{

void move()
{
System.out.println("moving...");
}

}
class Bird extends Animal
{

void move()
{
System.out.println("flying.....");
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


