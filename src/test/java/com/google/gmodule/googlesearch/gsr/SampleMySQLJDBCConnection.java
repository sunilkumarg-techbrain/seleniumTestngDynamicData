package com.google.gmodule.googlesearch.gsr;
import java.sql.*;
import com.google.gmodule.googlesearch.GoogleSearchBaseTest;
public class SampleMySQLJDBCConnection extends GoogleSearchBaseTest {
	public static void main(String args[]) {
		SampleMySQLJDBCConnection sampleConnection = new SampleMySQLJDBCConnection();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/googlesearch", "root",
					"BlueVegan@5");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM googlesearch.searchtextlist;");
			while (rs.next())
				sampleConnection.log(String.valueOf(rs.getInt(1)) + "  " + rs.getString(2).toString() + "  "
						+ rs.getString(3).toString());
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}