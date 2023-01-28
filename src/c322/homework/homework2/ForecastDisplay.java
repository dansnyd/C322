package c322.homework.homework2;

public class ForecastDisplay implements Observer, DisplayElement{

    private float lastPressure;

    private float currentPressure = 29.92f;

    private Subject weatherData;

    public ForecastDisplay(WeatherData weatherData)
    {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure)
    {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
    public void display()
    {
        if (currentPressure > lastPressure )
        {
            System.out.println("Forecast: Improving weather on the way!");
        }
        else if (currentPressure == lastPressure )
        {
            System.out.println("Forecast: More of the same!");
        }
        else if (currentPressure < lastPressure )
        {
            System.out.println("Forecast: Watch out for cooler, rainy weather!");
        }
    }
}
