import java.io.*;

class Eight
{
public static void main(String args[]) throws IOException
{
FileOutputStream fos=new FileOutputStream(args[0],true);

byte b[]=args[1].getBytes();
fos.write(b);
fos.write('\n');

fos.close();

}

}
