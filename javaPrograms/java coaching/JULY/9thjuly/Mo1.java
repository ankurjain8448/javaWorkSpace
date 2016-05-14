class A
{
/*
void area(double n)
{
System.out.println(3.14*n*n);
}

void area(int n)
{
System.out.println("n*n");
}
*/


void area(int n,int m)
{
System.out.println(n*m);
}

void area(char n)
{
System.out.println("char");
}


}


class Mo1
{
public static void main(String args[])
{
/*
char ch=65;
System.out.println(ch);
*/


A obj=new A();
obj.area((char)66);
obj.area(10,20);


}
}
