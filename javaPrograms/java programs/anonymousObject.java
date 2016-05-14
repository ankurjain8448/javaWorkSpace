class q
{
int n;
void p()
{
System.out.print("\nn is now "+ ++n);
}
}


class AnonymousObject
{
public static void main(String args[])
{
q obj = new q();
//new q();   <---Anonymous object
new q().p();
new q().p();
new q().p();
System.out.print("\nfor object ");
obj.p();
obj.p();
obj.p();

}
}
