package com.JDBCOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDMLCommands {

	public static void main(String[] args) throws SQLException{
		//1.Create Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wiprotable", "root","wiproDB@123");
		
		//2.Create statement/query
		Statement stmt = con.createStatement();
		String s ="INSERT INTO book_det1 values('PH003','Mobility','che','Raghavendra','ABC','S','2023',800.000)";
		//String s= "UPDATE 
		
		//3.Execute statement/query
	   stmt.execute(s);
	   
	   //4.close connection
	   con.close();
	   System.out.println("Statement Executed :Inserted Values Sucessfuly");
		

	}

}
