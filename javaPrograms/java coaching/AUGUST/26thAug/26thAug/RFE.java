class M
{
public void finalize()
{
System.out.println("i m leaving this world...  Sach mein");
}

}

class RFE
{
public static void main(String args[])
{
new M();
System.runFinalizersOnExit(true);
//System.runFinalization();
System.out.println("Vishnu Vishnu");
}

}

























