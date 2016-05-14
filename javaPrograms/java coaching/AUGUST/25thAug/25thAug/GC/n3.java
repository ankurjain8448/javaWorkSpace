class A
{
public void finalize()
{
System.out.println("no more...");
}

void display()
{
System.out.println("this is display");
}


}

class N3
{
public static void main(String args[])
{
new A().display();

System.gc();

}

}

























