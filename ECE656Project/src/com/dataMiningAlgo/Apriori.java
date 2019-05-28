package com.dataMiningAlgo;

import java.sql.Connection;
import java.sql.SQLException;

import com.dataMiningAlgo.jdbc.JDBCConnection;

public class Apriori {

	public void createItemSet(int year) {
		JDBCConnection con = new JDBCConnection();
		Connection conn;
		try {
			conn = con.getConnection();
			System.out.println(conn);
			String query = "{CALL insert_into_itemset(?)}"
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
