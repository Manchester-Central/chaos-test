package chaos.test;

//This is an interface. What an interface does is allow you to use different classes, but call the same function on them.
//They are really helpful for lists, in which you don't particularly know what class you are getting.
//The perfect example is the printers list in main. We are each creating a new class, but I want to be able to call the same function on all of them.
//You can add this interface to your class by adding "implements HelloWorldPrinter" after you define the class name.
// ex: 
// public class JoshPrinter implements HelloWorldPrinter {
// }
public interface HelloWorldPrinter {
	void printMessage();
}
