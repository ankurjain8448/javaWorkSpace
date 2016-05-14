import javax.swing.*;
import java.math.*;


class facti
{
BigInteger one = new BigInteger("1");

BigInteger fact(BigInteger n)
{
String m=n.toString();
if(m.equals("0"))
return new BigInteger("1");
else
return n.multiply(fact(n.subtract(one)));
}
}

class Factorial
{

public static void main(String args[])
{
String f=JOptionPane.showInputDialog("Enter any number");
BigInteger num = new BigInteger(f);
facti obj = new facti();
BigInteger finalFactrial = obj.fact(num);
JOptionPane.showMessageDialog(null,finalFactrial);
}
}


