package week05;
//3.	Create two classes that implement the Logger interface
//b.	SpacedLogger
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
//6.
		String spacedLog = String.join(" ", log.split(""));
//7.
        System.out.println(spacedLog);
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
//8.
		 String spacedError = "ERROR: " + String.join(" ", error.split(""));
	     System.out.println(spacedError);
		
	}

}
