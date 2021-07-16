package jdbcDemo;

import java.sql.*;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/salesorder";
		String user = "root";
		String pass = "Croci@315";
		String query = "select ShortName,customerID from salesorder.customermaster";
		
		Class.forName("com.mysql.cj.jdbc.Driver");  // load and register
		Connection con = DriverManager.getConnection(url, user, pass);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		String name = rs.getString("ShortName");
		int Id = rs.getInt("customerID");

		System.out.println(name);
		System.out.println(Id);
		st.close();
		con.close();
		}

	}

