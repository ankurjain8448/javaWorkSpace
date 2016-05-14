class C1
{
public static void main(String args[]) 
{

/*
There are two bank accounts A and B.We want to transfer some amount C from A to B.
*/

try
{
/*
connect to the bank's server of A
check the balance of A
debit C to A
Connect to the bank's server of B
credit C to B
}
catch(BankException e)
{
//cancel the debit
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
