class A
{

int one(int first,int second)
{
if(first>second)
return first;
else
return second;
}

}

class Five
{
public static void main(String args[])
{
A obj=new A();
System.out.println(obj.one(15,20));
}

}
