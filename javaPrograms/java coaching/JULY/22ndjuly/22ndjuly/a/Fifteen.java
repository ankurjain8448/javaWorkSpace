abstract class Car
{
abstract void switchGear();
abstract void accelerate();
abstract void applyBrake();
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

void checkAllSystem()
{
System.out.println("All Systems checked");
}


}


class Fifteen
{
public static void main(String args[])
{

Car c=new BMW();
c.switchGear();
c.accelerate();
c.applyBrake();
//c.checkAllSystem(); //errors

}
}



