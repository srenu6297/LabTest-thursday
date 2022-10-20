package user_Mgt_Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class userFile 
{
	public static boolean insertUser(String name,String pas)
	{
		try
		{
			Connection con=connection.createConnection();
			PreparedStatement ps=con.prepareStatement("insert into users(uname,password) values (?,?)");
			ps.setString(1, name);
			ps.setString(2, pas);
			ps.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
	public static boolean listOfUser()
	{
		try
		{
			Connection con=connection.createConnection();
			Statement pstmt=con.createStatement();
			ResultSet rs=pstmt.executeQuery("select * from users");
			
			while(rs.next())
			{
				System.out.println("UserName : "+rs.getString(1)+"  ||   UserPassword : "+rs.getString(2));
			}
			System.out.println("\n\n");
			return true;
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
	public static boolean deleteUser(String name)
	{
		try
		{
			Connection con=connection.createConnection();
			PreparedStatement ps=con.prepareStatement("delete from users where uname=?");
			ps.setString(1, name);
			
			ps.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
	}

	public static boolean updatePassword(String name,String npass)
	{
		try
		{
			Connection con=connection.createConnection();
			PreparedStatement ps=con.prepareStatement("update users set password=(?) where uname=(?)");
			ps.setString(1, npass);
			ps.setString(2, name);
			ps.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
	public static boolean retrieveUser(String uname)
	{
		try
		{
			Connection con=connection.createConnection();
			PreparedStatement pstmt=con.prepareStatement("select uname,password from users where uname=(?)");
			pstmt.setString(1, uname);
			ResultSet rs=pstmt.executeQuery();
			rs.next();
			System.out.println("USER NAME : "+rs.getString(1)+"  PASSWORD : "+rs.getString(2));
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
	


}
