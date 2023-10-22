package com.sunbeam;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements AutoCloseable
{
	private Connection con;
	
	public UserDao() throws SQLException
	{
		con=DbUtil.getConnection();
	}
	
@Override
public void close() throws Exception
{
	try 
	{
		if(con!=null) //if there's a connection
			con.close();
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
	//create user i.e. save
	public  int save(Users user) throws SQLException 
	{
		int cnt=0;
		java.util.Date udate=user.getDob();
		java.sql.Date sdate=new java.sql.Date(udate.getTime());
		String sql = "insert into users values(default, ?, ?, ?, ?, ?, false,'voter')";
		
		try(PreparedStatement stmt= con.prepareStatement(sql))
		{
			stmt.setString(1,user.getFname());
			stmt.setString(2,user.getLname());
			stmt.setString(3,user.getEmail());
			stmt.setString(4,user.getPassword());
			stmt.setDate(5,sdate);
			cnt=stmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	} 
	
	//Read all users
	public List<Users> read()
	{
		List<Users> list=new ArrayList();
		String sql="Select * from users";
		try(PreparedStatement stmt=con.prepareStatement(sql))
		{
			try(ResultSet rs=stmt.executeQuery()){
			
			while(rs.next())
			{
				Users user=new Users();
				user.setId(rs.getInt("id"));
				user.setFname(rs.getString("first_name"));
				user.setLname(rs.getString("last_name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));

				java.sql.Date sdate=rs.getDate("dob");
				java.util.Date udate= new java.sql.Date(sdate.getTime()) ;
				user.setDob(udate);
				
				user.setStatus(rs.getBoolean("status"));
				user.setRole(rs.getString("role"));
				list.add(user);	
				}	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	//update user
	int update(Users user) 
	{
		int cnt=0;
		String sql="update users set first_name=?, status=? where id=?";
		try(PreparedStatement stmt= con.prepareStatement(sql))
		{
			stmt.setString(1, user.getFname());
			stmt.setBoolean(2, user.isStatus());
			stmt.setInt(3, user.getId());
			cnt =stmt.executeUpdate();
          
		}//stmt.close();
		catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;	
	}
	
	//Delete User
	
	public int delete(int id) throws SQLException {
		int cnt;
		String sql="delete from users where id=?";
		try( PreparedStatement stmt=con.prepareStatement(sql)){
			stmt.setInt(1,id);
			 cnt=stmt.executeUpdate();
		}
		return cnt;
		
	}
	
	

}
