package model;
import java.sql.*;
public class FoodDao {
	private Connection cn=null;//instance variable
	private Statement st=null;
	private PreparedStatement ps=null;
	//private ResultSet rs=null;
	//private String select_sql="select * from product";
	private String insert_sql="insert into food values(?,?,?)";
	private String delete_sql="delete from food where fid=?";
	private String update_sql="update food set fname=?,price=? where fid=?";
	public void updateData(String fid,String fname,double price)
	{
		try
		{
		  
		utilities.ConnctionFactory con=new utilities.ConnctionFactory();
			   cn=con.getConn();
			ps=cn.prepareStatement(update_sql);
		   ps.setString(3,fid);
		   ps.setString(1,fname);
		   ps.setDouble(2,price);
		   ps.executeUpdate();//saving data into table
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
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
	public void deleteData(String fid)
	{
		try
		{
		  
		utilities.ConnctionFactory con=new utilities.ConnctionFactory();
			   cn=con.getConn();
			ps=cn.prepareStatement(delete_sql);
		   ps.setString(1,fid);
		  ps.executeUpdate();//saving data into table
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
