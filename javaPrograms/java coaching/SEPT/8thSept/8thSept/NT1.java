import java.sql.*;

class NT1
{
public static void main(String args[])
{



try
{
Connection con=null;

	try
	{
	con=DriverManager.getConnection("","","");	
	}
	finally
	{
	con.close();
	}

}//outer
catch(SQLException e)
{
System.out.println(e);
}


}

}
