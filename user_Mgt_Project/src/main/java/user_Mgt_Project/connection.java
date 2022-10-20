package user_Mgt_Project;

import java.sql.Connection;
import java.sql.DriverManager;


public class connection {
	
		private static Connection con;
		public static Connection createConnection() throws Exception
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","renu");
			return con;
			
		}


	}




