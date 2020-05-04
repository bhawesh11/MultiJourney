package GenericFunctions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;


public class TestData {

	JSONObject testData;

	// CONSTRUCTOR:
	TestData(Database db, String scriptName) {
		String json = db.getJSON(scriptName);
		try {
			testData = new JSONObject(json);
		} catch (JSONException e) {
			e.printStackTrace();	
		}
		if (testData != null) {
			System.out.println("Fetched test data for script: " + scriptName);
		}
	}

	// ---------------------------------------------------------------

	private final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
	private final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
	Random rand = new Random();
	StringBuilder builder;

	public String createRandomString(int length) {
		builder = new StringBuilder();
		for (int i = 1; i <= length; i++) {
			if (i == 1) {
				builder.append(CHAR_UPPER.charAt(rand.nextInt(26)));
			} else {
				builder.append(CHAR_LOWER.charAt(rand.nextInt(26)));
			}
		}
		return builder.toString();
	}// Closing CreateRandomString method

	// ------------------------------------------------------------------
	// GET VALUE FROM JSON
	public String getTestData(String key) {
		String value = null;
		try {

			// SPLIT KEYS WRT '.'
			String[] keyArr = key.split("\\.");

			JSONObject obj = testData.getJSONObject(keyArr[0]);

			// REACH TILL FINAL JSON OBJECT
			if (keyArr.length > 2) {
				for (int i = 1; i < keyArr.length - 1; i++) {
					obj = obj.getJSONObject(keyArr[i]);
				}
			}
			// GET VALUE ACCORDING TO KEY
			value = obj.getString(keyArr[keyArr.length - 1]);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	// ---------------------------------------------------------------------
	// GET DATE AS REQUIRED:

	public String getDate(int offSet) {

		// NO. OF MILLI-SECONDS IN A DAY
		long DAY_IN_MS = 1000 * 60 * 60 * 24;

		// GETTING DATE ACCORDING TO OFFSET
		Date myDate = new Date(System.currentTimeMillis()
				+ (offSet * DAY_IN_MS));

		// CHANGING THE FORMAT OF THE DATE
		SimpleDateFormat reqDate = new SimpleDateFormat("MM/dd/yyyy");

		// RETURNING DATE IN STRING
		return reqDate.format(myDate);
	}

}// Closing CLASS
