package week05;
//3.	Create two classes that implement the Logger interface
//a.	AsteriskLogger
//b.	SpacedLogger

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
//4.
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
//5.
		System.out.println("****************");
        System.out.println("***Error: " + error + "***");
        System.out.println("****************");
		
	}

}
