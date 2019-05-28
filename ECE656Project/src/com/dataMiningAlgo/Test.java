package com.dataMiningAlgo;

import java.sql.Connection;
import java.sql.SQLException;

import com.dataMiningAlgo.jdbc.JDBCConnection;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		JDBCConnection con = new JDBCConnection();
		Connection conn = con.getConnection();
		System.out.println(conn);
		
	}

}
