package chaos.test;

import java.util.Date;

public class KatiePrinter implements HelloWorldPrinter {

	@Override
	public void printMessage() {
		Date today = new Date(); 
		System.out.println("Katie says: Today is " + today.toString());
		
		
	}

}
