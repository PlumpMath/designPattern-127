package designPattern;

import designPattern.observer.entity.CurrentConditionsDisplay;
import designPattern.observer.entity.WeatherData;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
    }
}
