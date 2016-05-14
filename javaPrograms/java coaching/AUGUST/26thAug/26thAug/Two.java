import javax.swing.*;

class A
{

public void finalize()
{
System.out.println("Narayan...");
}

}

class Two
{


public static void main(String args[])
{

new A();
new A();
JOptionPane.showMessageDialog(null,"Krishna");


}

}

























