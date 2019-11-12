package com.example.demo.controller;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try{  
//			System.out.println("*******############*******************");
//					Class.forName("com.mysql.jdbc.Driver");  
//					Connection con=DriverManager.getConnection(  
//					"jdbc:mysql://mysql3000.mochahost.com:3306/dsrtech_cdcol","dsrtech_admin","meaow@#@chiku");  
//					
//					DatabaseMetaData dbmd = con.getMetaData();
//					
//		            String[] types = {"TABLE"};
//		            ResultSet rs = dbmd.getTables(null, null, "%", types);
//		            while (rs.next()) 
//		                System.out.println(rs.getString("TABLE_NAME"));
//		       
//		            
//					con.close();  
//					}catch(Exception e){ System.out.println(e);}
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://mysql3000.mochahost.com:3306/dsrtech_cdcol","dsrtech_admin","meaow@#@chiku");
							System.out.println(con);
							PreparedStatement p=con.prepareStatement("select * from tbl_registration");
						ResultSet rs= p.executeQuery();
//						System.out.println("RRR  "+rs);
						while(rs.next())
						{
//							System.out.println("RRRSS  "+rs);
							System.out.println(rs.getString(1));
							System.out.println(rs.getString(2));
							System.out.println(rs.getString(3));
							System.out.println(rs.getString(4));
						}
				} catch (Exception e) {
		            System.err.println("Got an exception! ");
		            System.err.println(e.getMessage());
		        }
	/*	try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://mysql3000.mochahost.com:3306/dsrtech_cdcol","dsrtech_admin","meaow@#@chiku");
					System.out.println(con);
					Statement p=con.createStatement();
				 p.executeUpdate("INSERT INTO tbl_login (id,user_name,password,dated)  VALUES (1,'nancy', '123', '2005-04-11 17:54:35')");
				 System.out.println("Inserted records into the table...");

		} catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }*/
		
	}

}
