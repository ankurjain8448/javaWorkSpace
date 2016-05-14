interface I1
{
int a=400;
}

interface I2 
{
int b=100;
}

interface I3 extends I1,I2
{
int c=a+b;
}

class Seventeen implements I3
{
public static void main(String args[])
{
System.out.println(c);
}
}
