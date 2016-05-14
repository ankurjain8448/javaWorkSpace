import java.io.*;

class Four20
{
public static void main(String args[]) throws IOException
{
FileWriter fw=new FileWriter(args[0]);
PrintWriter pw=new PrintWriter(fw);

pw.println("Virendra Sehwag");
pw.println(2);
pw.println(false);
pw.println(9487.32);
pw.println('k');

fw.close();
}

}
