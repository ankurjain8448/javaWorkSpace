class a
{
int n;
static int m;
}


class Static
{
public static void main(String args[])
{
a obj1 = new a();
obj1.n=5;
obj1.m=20;


a obj2 = new a();
obj2.n=10;
obj2.m=30;


a obj3 = new a();
obj3.n=50;

obj3.m=a.m + obj1.m-obj2.m;
System.out.println(obj3.m);
System.out.println(obj1.n + obj1.m + obj2.n + obj2.m + obj3.n + obj3.m);

}
}
