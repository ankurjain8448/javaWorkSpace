import java.io.*;

class Ten
{
public static void main(String args[]) throws IOException
{
FileWriter fw=new FileWriter(args[0],true);
fw.write('V');
fw.close();
}

}
