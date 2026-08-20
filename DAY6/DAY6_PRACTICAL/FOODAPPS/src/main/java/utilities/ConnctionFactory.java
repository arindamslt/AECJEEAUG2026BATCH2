package utilities;
import java.sql.*;
public class ConnctionFactory {
	private Connection cn=null;
	public Connection getConn()
	{
		try
		{
		   Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		   //ESTABLISH THE CONNECTION
		   cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/FOODAPPSDBS","root","arindam");
		  
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return cn;
	}
}
