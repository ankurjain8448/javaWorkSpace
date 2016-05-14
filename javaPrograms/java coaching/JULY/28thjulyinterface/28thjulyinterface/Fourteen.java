interface I1
{
int n=100;
}

interface I2 extends I1
{
int m=200;
}


class Fourteen implements I2
{
public static void main(String args[])
{
System.out.println(n+m);
}
}
