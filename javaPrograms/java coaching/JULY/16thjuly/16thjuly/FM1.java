class NRIAccount
{

private int ob;

private NRIAccount(int ob)
{
this.ob=ob;
}

public static NRIAccount getNRIAccount(int ob)
{

if(ob>=50000)
{
NRIAccount obj=new NRIAccount(ob);
return obj;
}
else 
return null;
}

void display()
{
System.out.println(ob);
}
}

class FM1
{
public static void main(String args[])
{
NRIAccount obj=NRIAccount.getNRIAccount(Integer.parseInt(args[0]));
if(obj!=null)
obj.display();
else
System.out.println("Opening balance must be >=50000");
}

}
