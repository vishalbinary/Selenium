import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;

public class DatabaseConnectivity  {
	public static void main(String[] args) throws SQLException {
		getConnection();
		
	}
	public static void getConnection() throws SQLException {
	Assert.assertEquals(false, false, "");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "");
	Statement stmt=con.createStatement();
	String query="select empId, name, salary, depName from pim LEFT JOIN "
			+ "department ON pim.depId=department.depId";
	//String query1="";
	ResultSet rs=stmt.executeQuery(query);
	
	while(rs.next()) {
		System.out.println(rs.getString("empId")+":"+rs.getString("name")+":"+rs.getString("salary")+":"+rs.getString("depName"));
		
	}
 
	
	
	}

}
