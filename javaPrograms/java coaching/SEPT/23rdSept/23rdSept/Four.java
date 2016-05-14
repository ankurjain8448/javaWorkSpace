import java.io.*;

class Four
{
public static void main(String args[]) throws IOException
{
FileOutputStream fos=new FileOutputStream(args[0]);

byte b[]=args[1].getBytes();
fos.write(b);

fos.close();

}

}
