

class A
{
void one(int ...n)
{
System.out.println("one has just been called");

for(int d=0;d<n.length;d++)
System.out.println(n[d]);
}

}


class Va1
{
public static void main(String args[])
{
A obj=new A();
/*
obj.one(78);
obj.one(29,15);
obj.one(2,9,1,5);

obj.one();
*/

int arr[]={12,78,64,97,25};

obj.one(arr);
}

}

