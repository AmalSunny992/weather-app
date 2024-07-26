import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WeatherAppTest {

    @Test
    public void testGetWeather() {
        WeatherApp app = new WeatherApp();
        String expected = "Sunny";
        String actual = app.getWeather("Los Angeles");
        assertEquals(expected, actual);
    }
}