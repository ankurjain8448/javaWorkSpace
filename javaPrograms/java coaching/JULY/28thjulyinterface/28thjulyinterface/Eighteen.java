interface I1
{
int a=400;
}

interface I2 extends I1
{
int a=800;
}


class Eighteen implements I2
{
public static void main(String args[])
{
System.out.println(a);
}
}
