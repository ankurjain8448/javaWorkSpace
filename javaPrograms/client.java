import java.io.*;
import java.net.*;

class client
{
public static DatagramSocket ds;
public static int clientport = 81;
public static int servport = 80;
public static void main(String args[])
{
try{
byte buffer[] = new byte[1024];
ds = new DatagramSocket(clientport);
BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
InetAddress ia =InetAddress.getByName("A_J");
while(true)
{
DatagramPacket p= new DatagramPacket(buffer,buffer.length);
ds.receive(p);
String pax = new String(p.getData(),l,p.getLength());
System.out.println(pax);
}
}
catch(Exception e)
{}
}}
