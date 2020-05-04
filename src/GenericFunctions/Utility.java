package GenericFunctions;

import org.openqa.selenium.JavascriptExecutor;

public class Utility {

	public static void stop(Testing test) {
		JavascriptExecutor executor = (JavascriptExecutor) test.driver;
		String pageLoadStatus = (String) executor
				.executeScript("return document.readyState");

		double i = 0;
		while (!pageLoadStatus.equals("complete")) {
			try {
				Thread.sleep(500);
				pageLoadStatus = (String) executor
						.executeScript("return document.readyState");
				i = i + 0.5;
			} catch (Exception e) {
				System.out.println("WAIT FOR THE PAGE NOT WORKING.");
			}

		}
		// log.info("Page active in "+i+" seconds.");
	}

	public static void scrollToBottom(Testing test) {
		JavascriptExecutor js = (JavascriptExecutor) test.driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void scrollToTop(Testing test) {
		JavascriptExecutor js = (JavascriptExecutor) test.driver;
		js.executeScript("window.scrollTo(0,0)");
	}
}// closing class