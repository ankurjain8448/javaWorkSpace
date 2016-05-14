
class A
{
int[] one()
{
int v[]={45,72,89};
return v;
}

}


class Four
{
public static void main(String args[])
{
A obj=new A();

int z[]=obj.one();

for(int d=0;d<z.length;d++)
System.out.println(z[d]);


}

}

