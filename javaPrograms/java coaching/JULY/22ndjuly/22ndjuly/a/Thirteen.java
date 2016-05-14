abstract class Car
{
abstract void switchGear();
abstract void accelerate();
abstract void applyBrake();
}

class Nano extends Car
{
void switchGear()
{
System.out.println("Trying to change gear... but no idea ...");
}

void accelerate()
{
System.out.println("Trying to accelerate... but no idea ...");
}

void applyBrake()
{
System.out.println("Trying to applyBrake... but no idea ...");
}

}

class BMW extends Car
{
void switchGear()
{
System.out.println("Done changing gear..");
}

void accelerate()
{
System.out.println("Done accelerating...");
}

void applyBrake()
{
System.out.println("Brakes Applied...");
}

}



 
class Thirteen
{
public static void main(String args[])
{
Nano n=new Nano();
n.switchGear();
n.accelerate();
n.applyBrake();

BMW b=new BMW();
b.switchGear();
b.accelerate();
b.applyBrake();




}
}



