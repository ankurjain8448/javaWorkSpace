import java.io.*;

class One
{
public static void main(String args[]) throws IOException
{
System.out.println("Maa Ambey");

FileOutputStream fos=new FileOutputStream(args[0]);

PrintStream ps=new PrintStream(fos);

System.setOut(ps);

System.out.println("MahaGauri");

}

}
