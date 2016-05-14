import java.io.*;

interface A
{
void one() ;
}


class B implements A
{

public void one() throws IOException
{
System.out.println("nahi chalta hai");
}

}


class Thrws8
{
public static void main(String args[])
{
new B().one();
}

}

