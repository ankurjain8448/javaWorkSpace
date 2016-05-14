import java.math.*;
import javax.swing.*;

class BI
{
public static void main(String args[])
{
String n1=JOptionPane.showInputDialog("Enter first number");

String n2=JOptionPane.showInputDialog("Enter second number");

BigDecimal num1=new BigDecimal(n1);
BigDecimal num2=new BigDecimal(n2);
BigDecimal num3=num1.multiply(num2);

JOptionPane.showMessageDialog(null,num3);

}
}
