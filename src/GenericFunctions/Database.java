package GenericFunctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {
	
	public static void printOutputInDataBase(){  
		try{  
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtestcases","root","Passw0rd");
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from application;");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4));
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
//	-----------------------------------------------------------------------------------------------
	
	public static void saveOutputInDataBase(String script, String brand, String result, String input, String output) {  
		try{  
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtestcases","root","Passw0rd");
			Statement stmt=con.createStatement();  
			stmt.executeUpdate("INSERT INTO test(SCRIPT_ID,APP_ID,BRAND_ID,RESULT,INPUT,OUTPUT,TRIGGERER,TIMESTAMP)"
				+ "VALUES("
				+ "(SELECT SCRIPT_ID FROM script WHERE SCRIPT_NAME='"+script.trim()+"'),"
				+ "(SELECT APP_ID FROM application WHERE APP_NAME='Quotes'),"
				+ "(SELECT BRAND_ID FROM brand WHERE BRAND_NAME='"+brand+"'),"
				+ "'"+ result +"',"
				+ "'"+ input +"',"
				+ "'"+ output +"',"
				+ "'Admin',"
				+ "CURRENT_TIMESTAMP)"); 
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			
		}
	}
	
}  
