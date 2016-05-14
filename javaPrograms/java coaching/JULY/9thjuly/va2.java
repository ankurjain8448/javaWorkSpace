

class A
{
void one(int k,int ...n)
{
System.out.println("one has just been called");

for(int d=0;d<n.length;d++)
System.out.println(n[d]);
}

}


class Va2
{
public static void main(String args[])
{
A obj=new A();
//obj.one();
obj.one(2,6);

}

}

