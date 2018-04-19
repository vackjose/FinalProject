package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Database {
	public static Connection conn;

	public static void main(String[] args) throws Exception {
		getConnection();

		// INSERT DATA
		try {

			String sql = "insert into customer (socialSecurity, address, email, firstName, lastName, userName, flightsBooked,"
					+ "state, zipCode,securityQuestion, paswword) values ('111223334', '123 dawson lane', 'jdoe@gmail.com', 'John', 'Doe', "
					+ "'jdoe123', '5', 'GA', '30303', 'First pet?', 'gsustudent')";
			PreparedStatement myStmt = conn.prepareStatement(sql);
			myStmt.executeUpdate(sql);

			System.out.println("Inserted Successfully");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("There is an error");
		}
		
		// UPDATE DATA
		try {

			String sql = "update customer set email='doejohn42@yahoo.com' where socialSecurity=111223333";
			PreparedStatement myStmt = conn.prepareStatement(sql);
			myStmt.executeUpdate(sql);

			System.out.println("Updated Successfully");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("There is an error");
		}
		
		// DELETE DATA
		try {

			String sql = "delete from customer where socialSecurity=123231234";
			PreparedStatement myStmt = conn.prepareStatement(sql);
			myStmt.executeUpdate(sql);

			System.out.println("Deleted Successfully");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("There is an error");
		}
		
		//SELECT DATA
		try {

			String sql = "SELECT * from customer";
			PreparedStatement myStmt = conn.prepareStatement(sql);
			myStmt.executeQuery(sql);

			System.out.println("DATA SELECTED:");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("There is an error");
		}
	}

	public static Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/sys";

			Class.forName(driver);

			conn = DriverManager.getConnection(url);
			System.out.println("Connected");
			return conn;
		} catch (Exception e) {

			System.out.println(e);

		}
		return null;
	}


}
