interface I1
{
int m=400;
}

interface I2 
{
int m=100;
}

class Fifteen implements I1,I2
{
public static void main(String args[])
{
System.out.println(m+m);

}
}
