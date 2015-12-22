package chaos.test;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Creates the list to store the printers
		List<HelloWorldPrinter> printers = new ArrayList<HelloWorldPrinter>();
		
		printers.add(new JoshPrinter());
		//Add your printers here:
		//printers.add(new Printer());
		
		//This will print out each of the printers to the console at the bottom of eclipse.
		for(HelloWorldPrinter printer: printers){
			printer.printMessage();
		}
		
	}

}
