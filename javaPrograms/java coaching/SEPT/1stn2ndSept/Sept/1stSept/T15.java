class T15
{
public static void main(String args[]) 
{

try
{
int n=Integer.parseInt(args[0]);
int m=Integer.parseInt(args[1]);
System.out.println(n/m);
}
catch(Exception e)
{
if(e instanceof ArrayIndexOutOfBoundsException)
System.out.println("array");
else if(e instanceof NumberFormatException)
System.out.println("nfe");
else if(e instanceof ArithmeticException)
System.out.println("arthmc");
}

System.out.println("Vishnu"); 

}

}
