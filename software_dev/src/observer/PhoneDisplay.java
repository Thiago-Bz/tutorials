package observer;

public class PhoneDisplay implements IObserver {
	IObservable weatherStation;

	public PhoneDisplay(IObservable weatherStation) {
		this.weatherStation = weatherStation;
		weatherStation.registerObserver(this);
	}

	@Override
	public void upate(float temperature) {
		System.out.println("Temperature in Celsius: " + temperature);
	}
}
