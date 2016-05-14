interface I1
{
int n=10;
}

interface I2
{
int m=20;
}


class Thirteen implements I1,I2
{
public static void main(String args[])
{
System.out.println(n+m);
}
}
