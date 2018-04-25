package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {
	public static Connection conn;

	public static void main(String[] args) throws Exception {
		getConnection();

		// INSERT DATA
		try {

			String sql = "insert into customer (socialSecurity, firstName, lastName, userName, pasword) values (111222336, 'Luis', 'guam', 'lpedro', 'hungry') ";
			PreparedStatement myStmt = conn.prepareStatement(sql);
			myStmt.executeUpdate(sql);

			System.out.println("Inserted Successfully");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("There is an error");
		}
		
		// UPDATE DATA
		try {

			String sql = "update customer set firstName = 'Pedro' where socialSecurity=111223333";
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
			ResultSet result = myStmt.executeQuery(sql);
			ArrayList<String> array = new ArrayList<String>();

			System.out.println("DATA SELECTED:");
			while (result.next()) {
				System.out.println(result.getString(1) + "\t" + result.getString(2) + "\t" + result.getString(3) + "\t" + result.getString(4) + "\t" + result.getString(5));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("There is an error");
		}
	}

	public static Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/sys";
			String username = "root";
			String password = "Hjbjhjbj23184";


			Class.forName(driver);

			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			return conn;
		} catch (Exception e) {

			System.out.println(e);

		}
		return null;
	}
	


}
