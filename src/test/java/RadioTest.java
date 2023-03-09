import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setVolume5() {//
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setVolume() {//
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setVolume10() {//
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setVolume11() {//
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setVolume1() {//
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setVolume1m() {//
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNum1() {//
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNum0() {//
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNum2() {//
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);
        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNum11() {//
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNum9() {//
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.pressNextStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextNum3() {//
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.pressNextStation();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevNum3() {//
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.pressPrevStation();
        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevNum0() {//
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.pressPrevStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolume0() {//
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.pressMinusVolume();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolume10() {//
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.pressMinusVolume();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolume10() {//
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.pressPlusVolume();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolume5() {//
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.pressPlusVolume();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
}
