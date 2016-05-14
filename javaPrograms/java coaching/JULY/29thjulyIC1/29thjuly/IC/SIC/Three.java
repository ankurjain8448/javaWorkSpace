class Fruit
{

static class Apple
{
void taste()
{
System.out.println("Sweet");
}
}

static class Mango
{
void taste()
{
System.out.println("Best");
}
}

static class Orange
{
void taste()
{
System.out.println("Gr8 4 health");
}
}

}


class Three
{
public static void main(String args[])
{
Fruit.Apple apple=new Fruit.Apple();
apple.taste();

Fruit.Mango mango=new Fruit.Mango();
mango.taste();


}

}



