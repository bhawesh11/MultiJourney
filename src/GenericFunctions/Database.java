package GenericFunctions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {

	public String getJSON(String scriptName) {
		Connection con;
		String jsonString = null;
		String sql = "SELECT testdata FROM data d, script s "
				+ "WHERE d.AppId = 1 "
				+ "AND d.ScriptId = s.ScriptId "
				+ "AND s.ScriptName= ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/qat", "root","Passw0rd");
			java.sql.PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, scriptName);
			ResultSet rs = stmt.executeQuery();
			if(rs.next())
			jsonString = rs.getString(1);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return jsonString;
	}

	// -----------------------------------------------------------------------------------------------

	public static void saveOutputInDataBase(String script, String brand,
			String result, String input, String output) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://10.1.25.19:3306/qat?allowPublicKeyRetrieval=true&useSSL=false", "root",
					"P@ssw0rd");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("INSERT INTO test(SCRIPT_ID,APP_ID,BRAND_ID,RESULT,INPUT,OUTPUT,TRIGGERER,TIMESTAMP)"
					+ "VALUES("
					+ "(SELECT SCRIPT_ID FROM script WHERE SCRIPT_NAME='"
					+ script.trim()
					+ "'),"
					+ "(SELECT APP_ID FROM application WHERE APP_NAME='Policy Center'),"
					+ "(SELECT BRAND_ID FROM brand WHERE BRAND_NAME='"
					+ brand
					+ "'),"
					+ "'"
					+ result
					+ "',"
					+ "'"
					+ input
					+ "',"
					+ "'"
					+ output + "'," + "'Admin'," + "CURRENT_TIMESTAMP)");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------
	// EXPERIMENTING
	public void insertRecordInDatabase(String script, String brand) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://10.1.25.19:3306/qat?allowPublicKeyRetrieval=true&useSSL=false", "root",
					"P@ssw0rd");
			Statement stmt = con.createStatement();
			int rowsInserted = stmt
					.executeUpdate("INSERT INTO test "
							+ "SET "
							+ "scriptId = (SELECT scriptId FROM script WHERE scriptName='"
							+ script.trim()
							+ "'), "
							+ "appId = (SELECT appId FROM application WHERE appName='Policy Center'), "
							+ "brandId = (SELECT brandId FROM brand WHERE brandName='"
							+ brand + "'), " + "TRIGGERER = 'Admin', "
							+ "timeStmap = CURRENT_TIMESTAMP");

			if (rowsInserted > 0) {
				// GET Record id
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}
}
