class A
{

A one()
{
System.out.print("Oh");
return this;
}

A two()
{
System.out.print(" My ");
return this;
}

void three()
{
System.out.println(" God! ");
}


}

class Five
{
public static void main(String args[])
{
A obj=new A();
obj.one().two().three();
obj.one();
}

}
