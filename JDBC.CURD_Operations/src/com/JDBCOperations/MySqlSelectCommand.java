package com.JDBCOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlSelectCommand {

	public static void main(String[] args)throws SQLException {
		//1.create connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wiprotable", "root", "wiproDB@123");
	
       //2.Create statement/query
		Statement stmt = con.createStatement();
		String s = "Select book_no, title, sub_code, author from book_det1";
		
	  //3.Execute Statement/Query 4.store data in result set
		ResultSet rs= stmt.executeQuery(s);
		while(rs.next()) {
			String bid = rs.getString("book_no");
			String tit = rs.getString("title");
			String scode = rs.getString("sub_code");
			String aut = rs.getString("author");
			
			System.out.println(bid + " " + tit + " " + scode + " " + aut);
		}
		//5.close statement
		 con.close();
		 System.out.println("Statement Executed : Query executed...");
		}
	}


