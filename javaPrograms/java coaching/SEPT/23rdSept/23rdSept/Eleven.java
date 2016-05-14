import java.io.*;

class Eleven
{
public static void main(String args[]) throws IOException
{
FileWriter fw=new FileWriter(args[0],true);
fw.write(args[1]);
fw.close();
}

}
