import javax.swing.*;
import java.math.*;


class fibonacci_dialogue
{
BigInteger fact()
{BigInteger i = new BigInteger("1");
BigInteger j = new BigInteger("0");
/*String m=n.toString();
if(m.equals("0"))
return new BigInteger("1");
else//BigInteger one = new BigInteger("1");
return n.multiply(fact(n.subtract(one)));
*/
for(int k=1;k<=10;k++)
{
j=i.add(j);
JOptionPane.showMessageDialog(null,j);
i = j.subtract(i);
}
}
}

class Factorial
{
public static void main(String[] args)
{
fibonacci_dialogue obj = new fibonacci_dialogue();
obj.fact();
}
}


