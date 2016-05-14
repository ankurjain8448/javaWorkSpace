import java.io.*;

interface A
{
void one() throws IOException;
}


class B implements A
{

public void one() 
{
System.out.println("chalta hai");
}

}


class Thrws7
{
public static void main(String args[])
{
new B().one();
}

}

