class A
{
private int n;
static private int count;

private A(int n)
{ this.n = n;count++;}

static A obj;

public static A getA(int n)
{
if(count ==0)
obj = new A(n);
return obj;
}

void display()
{ System.out.println(n);}
}

class Single_Ton_Design_pattern
{public static void main(String args[])
{
A obj1 = A.getA(10);
obj1.display();

A obj2 = A.getA(2340);
obj2.display();

}
}