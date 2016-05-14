import java.io.*;

class Two
{
public static void main(String args[]) throws IOException
{
//System.err.println("Alex");


FileOutputStream fos=new FileOutputStream(args[0],true);

PrintStream ps=new PrintStream(fos);

System.setErr(ps);

try
{
int n=Integer.parseInt(args[1]);
int m=Integer.parseInt(args[2]);
System.out.println(n/m);

}

catch(Exception e)
{
System.err.println(e);
}






}

}
