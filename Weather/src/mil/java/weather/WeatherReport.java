package mil.java.weather;

public class WeatherReport {
    public WeatherReport(Weather weather) {
        System.out.println("Generating weather report...");
        weather.forecast();
    }

    public void displayTemperature() {
        System.out.println("Current temperature: 28°C");
    }
}