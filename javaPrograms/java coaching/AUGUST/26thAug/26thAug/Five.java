class M
{
public void finalize()
{
System.out.println("bye all ");
}

}


class Five
{
public static void main(String args[])
{
new M();

System.gc();
}

}

























