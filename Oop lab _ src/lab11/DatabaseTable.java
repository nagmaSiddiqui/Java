package lab11;
import java.sql.*;
public class DatabaseTable {

	public static void main(String[] args) {
	      // Open a connection
	      try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "aryan", "alooparatha");
	         Statement stmt = conn.createStatement();
	      ) {		      
	         // Execute a query
	         System.out.println("Inserting records into the table...");          
	         String sql = "INSERT INTO q1 VALUES (100, 'aryan', 19)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO q1 VALUES (101, 'ram', 20)";
	         stmt.executeUpdate(sql);
	        
	        
	         System.out.println("Inserted records into the table...");   
	         ResultSet rs=stmt.executeQuery("select * from q1");  
	         while(rs.next())  
	         System.out.println(rs.getInt(1)+"  "+rs.getString(2) + " " +rs.getString(3));  
	 
	 
	         conn.close();  
	      } catch (SQLException e) {
	         e.printStackTrace();

		
		

	}

}
