package observer;

import java.util.Date;

public class TerminalDisplay implements IObserver {
	IObservable station;

	public TerminalDisplay(IObservable station) {
		this.station = station;
		station.registerObserver(this);
	}

	@Override
	public void upate(float temperature) {		
		System.out.println(new Date() + " Temperature: " + temperature + "C"); 	
	}

}
