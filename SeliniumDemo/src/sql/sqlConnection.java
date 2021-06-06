package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//		1. mention what kind of database
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.
			getConnection("jdbc:mysql://root@localhost/selva_db");
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery("SELECT * FROM selenium_users");
		while(result.next()) {
			System.out.println("Name: "+result.getString(1)
			       +"Pet Name: " +result.getString(2));
		}

	}

}
