package observer;

public class Test {
	public static void main(String[] args) {
		WeatherStation station = new WeatherStation();

		PhoneDisplay phoneDisplay = new PhoneDisplay(station);
		TerminalDisplay terminalDisplay = new TerminalDisplay(station);

		station.setTemperature(12.9f);

		station.removeObserver(phoneDisplay);

		station.setTemperature(30.9f);
		
		station.removeObserver(terminalDisplay);
		
		station.setTemperature(10.9f);
		
		station.registerObserver(phoneDisplay);
		
		station.setTemperature(19.9f);
	}
}
