class ArrayCopy{
public static void main(String args[])
{
int n[] = {1,2,3,4};
int m[] = new int[12];
System.arraycopy(n,1,m,4,3);
for(int p:m)
System.out.println(p);
}
}
