
class Three
{
public static void main(String args[])
{
int n[]={3,4,5,9,1,5,7,8};
int m[]=new int[10];

System.arraycopy(n,1,m,4,3);

for(int k=0;k<m.length;k++)
System.out.println(m[k]);

}

}
