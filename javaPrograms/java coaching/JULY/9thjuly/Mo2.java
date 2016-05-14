class A
{

void area(double n)
{
System.out.println(3.14*n*n);
}

void area(int n)
{
System.out.println("n*n");
}

int area(int m)
{
System.out.println("simple");
return 5;
}


}


class Mo2
{
public static void main(String args[])
{


A obj=new A();
System.out.println(obj.area(45));

}
}
