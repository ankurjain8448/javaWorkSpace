class One
{
public static void main(String args[])
{
int n[]={34,59,15,78};
int m[]={3,5};
n=m;

System.out.println(n[0]);
System.out.println(n[1]);

System.out.println(m[0]);
System.out.println(m[1]);

for(int p : m)
System.out.println(p);

for(int p : n)
System.out.println(p);


System.out.println(n[2]);

}

}
