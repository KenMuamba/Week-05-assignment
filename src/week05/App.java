package week05;
//9.
public class App {

	public static void main (String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
		asteriskLogger.log("Pizza");
		asteriskLogger.error("Cheese Burger");
		Logger spacedLogger =new SpacedLogger();
		spacedLogger.log("Pizza");
		spacedLogger.error("Cheese Burger");
	}
}
