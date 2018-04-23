package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {
	public static Connection conn;
	public static String sql = "";

	public static void main(String[] args) throws Exception {
		getConnection();
		
		Scanner input = new Scanner(System.in);
		sql = input.nextLine(); 
		
		if (sql.contains("insert"))
			Insert();
		
		if (sql.contains("update"))
			Update();
		
		if (sql.contains("delete"))
			Delete();
		
		if (sql.contains("select"))
			Select();
				
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
	
	public static void Insert() {
		// INSERT DATA
				try {

					PreparedStatement myStmt = conn.prepareStatement(sql);
					myStmt.executeUpdate(sql);

					System.out.println("Inserted Successfully");
				} catch (Exception ex) {
					ex.printStackTrace();				
					System.out.println("There is an error"); 
				}
		
	}
	
	public static void Update() {
		// UPDATE DATA 
				try {

					PreparedStatement myStmt = conn.prepareStatement(sql);
					myStmt.executeUpdate(sql);

					System.out.println("Updated Successfully");
				} catch (Exception ex) {
					ex.printStackTrace();
					System.out.println("There is an error");
				}
	}
	
	public static void Delete() {
		// DELETE DATA
				try {

					PreparedStatement myStmt = conn.prepareStatement(sql);
					myStmt.executeUpdate(sql);

					System.out.println("Deleted Successfully");
				} catch (Exception ex) {
					ex.printStackTrace();
					System.out.println("There is an error");
				}
	}
	
	public static void Select() {
		//SELECT DATA
				try {

					PreparedStatement myStmt = conn.prepareStatement(sql);
					
					ResultSet result = myStmt.executeQuery(sql);

					ArrayList<String> array = new ArrayList<String>();
					System.out.println("DATA SELECTED:");
					while(result.next()) {
						System.out.print(result.getString(1) + "\t" + result.getString(2) + "\t" + result.getString(3) + "\t" + result.getString(4)
						+ "\t" + result.getString(5) + "\t" + result.getString(6) + "\t" + result.getString(7) + "\t" + result.getString(8) + "\t" + result.getString(9)
						+ "\t" + result.getString(10) + "\t" + result.getString(11));
						System.out.println();
						
					}
					
				} catch (Exception ex) {
					ex.printStackTrace();
					System.out.println("There is an error");
				}
	}
	


}
