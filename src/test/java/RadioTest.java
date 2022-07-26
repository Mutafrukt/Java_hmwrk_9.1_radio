import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


/////////////////////!!! НОВЫЕ ТЕСТЫ ДЛЯ ЭТОГО ЗАДАНИЯ - со строчки 100 !!!/////////////////////


public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioTestForIncreaseVolume.csv")

    public void shouldPressButtonPlusForVolume(int newCurrentVolume, int expected) {

        Radio radio = new Radio();

        radio.setCurrentVolume(newCurrentVolume);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioTestForDecreaseVolume.csv")

    public void shouldPressButtonMinusForVolume(int newCurrentVolume, int expected) {

        Radio radio = new Radio();

        radio.setCurrentVolume(newCurrentVolume);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioTestForNextStationButton.csv")
    public void shouldPressNextButtonForStation(int currentStationNumber, int expected) {

        Radio radio = new Radio();

        radio.setNewCurrentStation(currentStationNumber);
        radio.nextStation();

        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioTestForPrevStationButton.csv")
    public void shouldPressPrevButtonForStation(int currentStationNumber, int expected) {

        Radio radio = new Radio();

        radio.setNewCurrentStation(currentStationNumber);
        radio.prevStation();

        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioTestForNotSetStationOverLimit.csv")
    public void shouldNotSetStationOverAndUnderLimit(int newCurrentStationNumber, int expected) {

        Radio radio = new Radio();

        radio.setNewCurrentStation(newCurrentStationNumber);

        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

   @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioTestForNotSetVolumeOverAndUnderLimit.csv")
    public void shouldNotSetVolumeOverAndUnderLimit(int newCurrentVolume, int expected) {

        Radio radio = new Radio();

        radio.setCurrentVolume(newCurrentVolume);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    ///НОВЫЕ ТЕСТЫ ДЛЯ КОНСТРУКТОРА///


    @ParameterizedTest ///Если пользователь захотел установить количество станций
    @CsvFileSource(files = "src/test/resources/radioConstructorShoulSetNumberOfStations.csv")
    public void shouldSetNumberOfStationsWhenConstructor
            (int customQuantityOfStations, int newCurrentStationNumber, int expected) {

        Radio radio = new Radio(customQuantityOfStations);
        radio.setNewCurrentStation(newCurrentStationNumber);

        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest ///Переключение на следующую станцию при количестве станций, установленном пользователем
    @CsvFileSource(files = "src/test/resources/radioConstructorShouldPressNextButtonForStation.csv")
    public void shouldPressNextButtonForStationWhenConstructor
            (int customQuantityOfStations, int newCurrentStationNumber, int expected) {

        Radio radio = new Radio(customQuantityOfStations);
        radio.setNewCurrentStation(newCurrentStationNumber);
        radio.nextStation();

        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest ///Переключение на предыдущюу станцию при количестве станций, установленном пользователем
    @CsvFileSource(files = "src/test/resources/radioConstructorShouldPressPrevButtonForStation.csv")
    public void shouldPressPrevButtonForStationWhenConstructor
            (int customQuantityOfStations, int newCurrentStationNumber, int expected) {

        Radio radio = new Radio(customQuantityOfStations);
        radio.setNewCurrentStation(newCurrentStationNumber);
        radio.prevStation();

        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}
