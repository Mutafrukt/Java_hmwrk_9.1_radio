import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldPressButtonPlusForVolume(){

        Radio radio = new Radio();

        radio.setCurrentVolume(4);
        radio.increaseVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPressButtonMinusForVolume(){

        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPressNextButtonForStation(){

        Radio radio = new Radio();

        radio.setNewCurrentStation(6);
        radio.nextStation();

        int expected = 7;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPressPrevButtonForStation(){

        Radio radio = new Radio();

        radio.setNewCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}
