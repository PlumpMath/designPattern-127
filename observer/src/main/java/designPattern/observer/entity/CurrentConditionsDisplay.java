package designPattern.observer.entity;

/**
 * Created by ht002 on 2016/5/23.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void display() {
		System.out.printf(
				"Current condition: %.2f F degrees and humidity %.2f%% humidity\n",
				this.temperature, this.humidity);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
}
