package ApplicationPages;

import GenericFunctions.BrowserFactory;

public class DUMMY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "//*[@identity='HasValidUSLicense']/div/div/label[contains(text(),'{0}')]";
		
		x = x.replace("{0}", "RANDOMTEXT");
		System.out.println(x);

		

	}



}
