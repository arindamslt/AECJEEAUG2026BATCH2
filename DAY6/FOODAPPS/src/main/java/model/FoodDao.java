package model;
import java.sql.*;
public class FoodDao {
	private Connection cn=null;//instance variable
	private Statement st=null;
	private PreparedStatement ps=null;
	//private ResultSet rs=null;
	//private String select_sql="select * from product";
	private String insert_sql="insert into food values(?,?,?)";
	public void insertData(String fid,String fname,double price)
	{
		try
		{
		  
		utilities.ConnctionFactory con=new utilities.ConnctionFactory();
			   cn=con.getConn();
			ps=cn.prepareStatement(insert_sql);
		   ps.setString(1,fid);
		   ps.setString(2,fname);
		   ps.setDouble(3,price);
		   ps.executeUpdate();//saving data into table
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
