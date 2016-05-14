import java.io.*;
import java.net.*;

class server
{
public static DatagramSocket ds;
public static int clientport = 81;
public static int servport = 80;
public static void main(String args[])
{
try{
byte buffer[] = new byte[1024];
ds = new DatagramSocket(servport);
BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
InetAddress ia =InetAddress.getByName("A_J");
while(true)
{
String str = dis.readLine();
if(str ==null || str.equals("END") || str.equals("end"))
break;
buffer = str.getBytes();
int l = str.length();
ds.send(new DatagramPacket(buffer,l,ia,clientport));
}
}
catch(Exception e)
{}
}
}