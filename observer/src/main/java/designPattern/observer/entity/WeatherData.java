package designPattern.observer.entity;

import java.util.ArrayList;

/**
 * Created by ht002 on 2016/5/23.
 */
public class WeatherData implements Subject {
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList();
	}

	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		int i = this.observers.indexOf(observer);
		if (i > 1) {
			this.observers.remove(observer);
		}
	}

	public void notifyObservers() {
		for (int i = 0; i < this.observers.size(); i++) {
			Observer observer = (Observer) this.observers.get(i);
			observer.update(this.temperature, this.humidity, this.humidity);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity,
			float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
