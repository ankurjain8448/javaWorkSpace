
class A
{
void one(int n[])
{
for(int k=0;k<n.length;k++)
System.out.println(n[k]);
}

}


class Three
{
public static void main(String args[])
{
A obj=new A();

int k[]={15,32,57};

obj.one(k);


}

}

