import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.assertEquals;

public class RadioTest {
    Radio radio = new Radio (10, 0, 5, 100, 0, 5);
    @Test
    public void radioTest() {
        Radio radio = new Radio ();
        Assertions.assertEquals(0,radio.getCurrentRadioStation());
    }
    @Test
    public void validateChangFields() {
        Radio radio = new Radio (10, 0, 5, 100, 0, 5);
        Assertions.assertEquals(5,radio.getCurrentRadioStation());
    }

    @Test
    public void changeAfterLastRadioStation() {
        Radio radio = new Radio (10, 0, 5, 100, 0, 5);
        radio.pressNextStation();
        Assertions.assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void changeUnderInitialRadioStation() {
        Radio radio = new Radio (10, 0, 5, 100, 0, 5);
        radio.pressPrevStation();
        Assertions.assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio (10, 0, 5, 100, 0, 5);
        radio.pressNextStation();
        Assertions.assertEquals(6, radio.getCurrentRadioStation());
    }
    @Test
    public void nextRadioStationTest() {
        Radio radio = new Radio (10, 0, 10, 100, 0, 5);
        radio.pressNextStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio (10, 0, 5, 100, 0, 5);
        radio.pressPrevStation();
        Assertions.assertEquals(4, radio.getCurrentRadioStation());
    }
    @Test
    public void prevRadioStationTest() {
        Radio radio = new Radio (10, 0, 0, 100, 0, 5);
        radio.pressPrevStation();
        Assertions.assertEquals(10, radio.getCurrentRadioStation());
    }
    @Test
    public void nextRadioStationTestMax() {
        Radio radio = new Radio (10, 0, 10, 100, 0, 0);
        radio.pressNextStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    public void nextRadioStationTestMax2() {
        Radio radio = new Radio (30, 0, 30, 100, 0, 0);
        radio.pressNextStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    public void afterInitialRadioStation() {
        Radio radio = new Radio (10, 0, 5, 100, 0, 5);
        Assertions.assertEquals(10, radio.getMaxRadioStation());
    }

    @Test
    public void underInitialRadioStation() {
        Radio radio = new Radio (10, 0, 5, 100, 0, 5);
        Assertions.assertEquals(0, radio.getMinRadioStation());
    }

    // volume
    @Test
    public void volumeOverMax() {
        Radio radio = new Radio (10, 0, 5, 100, 0, 5);
        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void volumeDownUnderMin() {
        Radio radio = new Radio (10, 0, 5, 100, 0, 5);
        Assertions.assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void plusVolume() {
        Radio radio = new Radio (10, 0, 5, 100, 0, 5);
        radio.pressPlusVolume();
        Assertions.assertEquals(6, radio.getCurrentVolume());
    }
    @Test
    public void plusVolumeTest() {
        Radio radio = new Radio (10, 0, 5, 100, 0, 100);
        radio.pressPlusVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void minusVolume() {
        Radio radio = new Radio (10, 0, 5, 100, 0, 5);
        radio.pressMinusVolume();
        Assertions.assertEquals(4, radio.getCurrentVolume());
    }
    @Test
    public void minusVolumeTest() {
        Radio radio = new Radio (10, 0, 5, 100, 0, 0);
        radio.pressMinusVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
