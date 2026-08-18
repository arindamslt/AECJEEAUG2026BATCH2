package jdbc;
import java.sql.*;
class TestConnection
{
	private Connection cn=null;//instance variable
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from product";
	private String insert_sql="insert into product values(?,?,?)";
	private String delete_sql="delete from product where pid=?";
	private String update_sql="update product set pname=?,price=? where pid=?";
	public void updateData()
	{
		try
		{
		   //Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		   //ESTABLISH THE CONNECTION
		  // cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEESDB","root","arindam");
			ConnectionFactory con=new ConnectionFactory();
			   cn=con.getConn();
			ps=cn.prepareStatement(update_sql);
		   ps.setString(3,"P2");
		   ps.setString(1,"LAPTOP");
		   ps.setDouble(2,45000.00);
		   ps.executeUpdate();//saving data into table
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void deleteData()
	{
		try
		{
		  // Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		   //ESTABLISH THE CONNECTION
		  // cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEESDB","root","arindam");
			ConnectionFactory con=new ConnectionFactory();
			   cn=con.getConn();
			ps=cn.prepareStatement(delete_sql);
		   ps.setString(1,"P3");
		  ps.executeUpdate();//saving data into table
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void insertData()
	{
		try
		{
		   //Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		   //ESTABLISH THE CONNECTION
		   //cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEESDB","root","arindam");
			ConnectionFactory con=new ConnectionFactory();
			   cn=con.getConn();
			ps=cn.prepareStatement(insert_sql);
		   ps.setString(1,"P3");
		   ps.setString(2,"TAB");
		   ps.setDouble(3,22000.00);
		   ps.executeUpdate();//saving data into table
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void getData()
	{
		try
		{
		   //Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		   //ESTABLISH THE CONNECTION
		  // cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEESDB","root","arindam");
		   ConnectionFactory con=new ConnectionFactory();
		   cn=con.getConn();
			st=cn.createStatement();//CREATE THE STATEMENT
		 //execute statement  and store the data into resultset
		   rs=st.executeQuery(select_sql);
		   while(rs.next())
		   {
			  // System.out.println(rs.getString(1));
			  // System.out.println(rs.getString(2));
			   //System.out.println(rs.getDouble(3));
			   System.out.println(rs.getString(1)+"==>"+rs.getString(2)+"==>"+rs.getDouble(3));
		   }
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
     }
}
public class JavaMysqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TestConnection ts=new TestConnection();
     //ts.insertData();
    // ts.deleteData();
    // ts.updateData();
     ts.getData();
	}

}
