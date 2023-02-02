package c322.labs.lab4.parta;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemperature = 0.0f;

    private float minTemperature = 200;

    private float tempSum= 0.0f;

    private int numReadings;

    private Subject weatherData;

    public StatisticsDisplay(WeatherData weatherData)
    {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure)
    {
        tempSum +=temperature;

        numReadings++;

        if (temperature > maxTemperature)
        {
            maxTemperature =temperature;
        }

        if (temperature< minTemperature)
        {
            minTemperature =temperature;
        }
        display();
    }
    public void display()
    {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemperature + "/" + minTemperature);
    }
}

