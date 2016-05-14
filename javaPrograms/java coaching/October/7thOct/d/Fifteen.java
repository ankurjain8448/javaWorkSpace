import java.io.*;
import java.util.*;

class Fifteen
{
public static void main(String args[]) throws Exception
{
FileInputStream fis=new FileInputStream(args[0]);
Locale  l1=new Locale(args[1],args[2]);
Scanner in=new Scanner(fis);

in.useLocale(l1);

while(in.hasNextDouble())
System.out.println(in.nextDouble());

}
}
