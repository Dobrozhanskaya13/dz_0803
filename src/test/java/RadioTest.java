import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setNum() {//
        Radio radio = new Radio();
        radio.setCurrentNum(5);
        int expected = 5;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNum0() {//Следующая радиостанция
        Radio radio = new Radio();
        radio.setCurrentNum(0);
        int expected = 0;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNum9() {//Следующая радиостанция
        Radio radio = new Radio();
        radio.setCurrentNum(9);
        int expected = 9;
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
    public void nextNumAfter9() {
        Radio radio = new Radio();
        radio.setCurrentNum(9);
        radio.nextNum();
        int expected = 0;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextNumAfter10() {//
        Radio radio = new Radio();
        radio.setCurrentNum(10);
        radio.nextNum();
        int expected = 1;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextNumAfterm1() {
        Radio radio = new Radio();
        radio.setCurrentNum(-1);
        radio.nextNum();
        int expected = 1;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextNumAfter0() {
        Radio radio = new Radio();
        radio.setCurrentNum(0);
        radio.nextNum();
        int expected = 1;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextNumAfter1() {
        Radio radio = new Radio();
        radio.setCurrentNum(1);
        radio.nextNum();
        int expected = 2;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextNumAfter2() {
        Radio radio = new Radio();
        radio.setCurrentNum(2);
        radio.nextNum();
        int expected = 3;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevNumAfter0() {
        Radio radio = new Radio();
        radio.setCurrentNum(0);
        radio.prevNum();
        int expected = 9;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevNumAfter9() {
        Radio radio = new Radio();
        radio.setCurrentNum(9);
        radio.prevNum();
        int expected = 8;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevNumAfter1() {
        Radio radio = new Radio();
        radio.setCurrentNum(1);
        radio.prevNum();
        int expected = 0;
        int actual = radio.getCurrentNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected =5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolumeAfter0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolumeAfter10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.prevVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolumeAfter1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolumeAfterm1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolumeAfter11() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolumeAfter10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.nextVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolumeAfter11() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.nextVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolumeAfterm1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.nextVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolumeAfter0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.nextVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolumeAfter6() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.nextVolume();
        int expected = 7;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolumeAfter9() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.nextVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolumeAfter5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.nextVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolumeAfter4() {//
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.nextVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolumeAfter3() {//
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.nextVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolumeAfter8() {//
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.nextVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolumeAfter7() {//
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.nextVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolumeAfter9() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.prevVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
