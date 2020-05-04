package GenericFunctions;

import org.json.JSONException;
import org.json.JSONObject;

public class Output {

	private JSONObject output;

	// CONSTRUCTOR:
	Output(TestData td) {
		try {
			output = new JSONObject();
			String lastName = td.createRandomString(6);
			output.put("LastName", lastName);
			output.put("Email", lastName + "@elephant.kom");
			/*int offset = Integer.parseInt(td
					.getTestData("PolicyInfo.EffectiveDate"));
			output.put("EffectiveDate", td.getDate(offset));*/
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	// ----------------------------------------------------------

	// GETTER / SETTER FOR OUTPUT:
	public void setOutput(String key, String value) {
		try {
			output.put(key, value);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	// ----------------------------------------------------------
	public String getOutput(String key) {
		String value = null;
		try {
			// GET VALUE ACCORDING TO KEY
			value = output.getString(key);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}
}// close Class
