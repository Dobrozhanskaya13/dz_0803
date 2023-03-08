import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setNum() {//Следующая радиостанция
        Radio radio = new Radio();
        radio.setCurrentNum(5);
        int expected = 5;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextNum() {//Следующая радиостанция
        Radio radio = new Radio();
        radio.setCurrentNum(5);
        radio.nextNum();
        int expected = 6;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextNumAfter9() {//Следующая радиостанция если текущая станция 9
        Radio radio = new Radio();
        radio.setCurrentNum(9);
        radio.nextNum();
        int expected = 0;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextNumAfter0() {//Следующая радиостанция если текущая станция 0
        Radio radio = new Radio();
        radio.setCurrentNum(0);
        radio.nextNum();
        int expected = 1;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevNumAfter0() {//Предыдущая радиостанция если текущая станция 0
        Radio radio = new Radio();
        radio.setCurrentNum(0);
        radio.prevNum();
        int expected = 9;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevNumAfter9() {//Предыдущая радиостанция если текущая станция 9
        Radio radio = new Radio();
        radio.setCurrentNum(9);
        radio.prevNum();
        int expected = 8;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevNumAfter1() {//Предыдущая радиостанция если текущая станция 1
        Radio radio = new Radio();
        radio.setCurrentNum(1);
        radio.prevNum();
        int expected = 0;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setVolume() {//Установление громкости
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected =5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolumeAfter0() {//Уровень громкости если 0
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolumeAfter10() {//Уровень громкости если 10
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.prevVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolumeAfter10() {//Уровень громкости если 10
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.nextVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolumeAfter0() {//Уровень громкости если 0
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.nextVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
