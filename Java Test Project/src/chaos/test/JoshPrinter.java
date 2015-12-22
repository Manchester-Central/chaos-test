package chaos.test;

import java.util.Random;

/**
 * This is my class! I created it as an example of how you can make a class that implements the HelloWorldPrinter interface.
 * You will be creating your own printer; feel free to try and print something cool! But nothing offensive that will get me in trouble!
 */
public class JoshPrinter implements HelloWorldPrinter {

	@Override
	public void printMessage() {
		int randInt = new Random().nextInt(100);
		System.out.println("Josh says: 'Hello!' " + randInt + " times!");
	}

}
