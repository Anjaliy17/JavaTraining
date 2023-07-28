
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class SelectTest {
	public static void main(String[] args) {
		
		//1. Load the Driver
		try {
			System.out.println("Trying to load the driver...");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver Loaded....");
			
			//2. Acquire the Connection
			System.out.println("trying to connect....");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected : " + conn);
			
			//3. make a desired statement (insert/update/delete/select)
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : " + statement);
			
			// 4. execute that statement
			ResultSet result = statement.executeQuery("SELECT * FROM MYDEPT120");
			
			//5. process the result if any
			while(result.next()) {
				System.out.println("DEPTNO : "+result.getInt(1));
				System.out.println("DNAME  : "+result.getString(2));
				System.out.println("LOC    : "+result.getString(3));
				System.out.println("-------------");
			}
			
			//6. close the statement, and connection
			result.close();
			statement.close();
			conn.close();
			System.out.println("Disconnected from the database....");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
