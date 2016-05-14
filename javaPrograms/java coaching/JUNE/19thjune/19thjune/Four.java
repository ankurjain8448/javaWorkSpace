class A
{
int roll;

public void setRoll(int roll)
{
roll=roll;
}

public int getRoll()
{
return roll;
}

}

class Four
{
public static void main(String args[])
{
A obj1=new A();
obj1.setRoll(12);
System.out.println(obj1.getRoll());
}

}
