package mil.java.weather;

public class WeatherRunner {
    public static void main(String[] args) {
        Weather weather = new Weather();
        WeatherReport report = new WeatherReport(weather);
        report.displayTemperature();
    }
}
