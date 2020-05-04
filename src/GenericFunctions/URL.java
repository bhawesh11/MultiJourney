package GenericFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class URL {
	private String url = null;
	private Properties prop;
	private FileInputStream fis;
	private String path;

	// CONSTRUCTOR
	URL() {
		try {
			prop = new Properties();
			path = "Info//url.properties";
			fis = new FileInputStream(path);
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// GETTER OF URL
	public String getURL(String environment) {
		url = prop.getProperty(environment);
		return url;
	}

}
