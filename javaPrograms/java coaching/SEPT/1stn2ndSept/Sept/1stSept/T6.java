class T6
{
public static void main(String args[]) 
{

try
{
int n=Integer.parseInt(args[0]);
int m=Integer.parseInt(args[1]);
System.out.println(n/m);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
catch(NumberFormatException e)
{
System.out.println(e);
}
catch(ArithmeticException e)
{
System.out.println(e);
}
System.out.println("Vishnu"); 

}

}
