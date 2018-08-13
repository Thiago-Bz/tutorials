package observer;

import java.util.ArrayList;

public class WeatherStation implements IObservable {
	ArrayList<IObserver> observerList = new ArrayList<>();
	float temperature = 0.0f;

	public WeatherStation() {
		super();
	}

	@Override
	public void registerObserver(IObserver observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observerList.forEach(o -> o.upate(temperature));
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setTemperature(float temp) {
		this.temperature = temp;

		measurementsChanged();
	}

}
