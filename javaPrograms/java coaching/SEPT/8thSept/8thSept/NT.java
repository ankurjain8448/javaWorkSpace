import java.sql.*;

class NT
{
public static void main(String args[])
{



Connection con=null;

try
{

con=DriverManager.getConnection("","","");

}
catch(SQLException e)
{
System.out.println(e);
}
finally
{
try
{
con.close();
}
catch(SQLException e)
{
System.out.println(e);
}

}


}

}
