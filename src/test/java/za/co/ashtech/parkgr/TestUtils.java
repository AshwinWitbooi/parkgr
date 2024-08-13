package za.co.ashtech.parkgr;

import java.util.Date;
import java.util.UUID;

/*This class is for common test functionality.
 * Reduce duplicate code for tests*/ 
public class TestUtils {
	
	public static String SENDER_ID = "Local_Test";

	/* This method generate random 
	 * UUID for a test */
	public static String testUUID() {
		return UUID.randomUUID().toString();
	}
	
	/* This method generate random 
	 * client external ref for a test */
	public static String externalRef() {
		return new Date().toString();
	}
}
