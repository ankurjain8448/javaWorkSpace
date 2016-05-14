//			even or odd
import javax.swing.*;

class Assignment_loop1_2
{
void cal()
{
String n=JOptionPane.showInputDialog("Enter any number");
int a = Integer.parseInt(n);
if(a%2==0)
JOptionPane.showMessageDialog(null,"number is even");
else
JOptionPane.showMessageDialog(null,"number is odd");
}


public static void main(String args[])
{
Assignment_loop1_2 obj = new Assignment_loop1_2();
obj.cal();

}
}
