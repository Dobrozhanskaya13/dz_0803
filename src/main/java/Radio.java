public class Radio {
    public int currentNum;//номер текущей радиостанции
    public int currentVolume;//уровень звука
    public int getCurrentNum() {
        return currentNum;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentNum(int newCurrentNum) {
        if (newCurrentNum >= 0 && newCurrentNum < 10) {
            currentNum = newCurrentNum;
        }
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 0 && newCurrentVolume < 11) {
            currentVolume = newCurrentVolume;
        }
    }
    public int nextNum() {
        if (currentNum >= 0 && currentNum < 9) {
            currentNum = currentNum + 1;
        }
        if (currentNum == 9) {
            currentNum = 0;
        }
        return currentNum;
    }
    public int prevNum() {
        if (currentNum > 0 && currentNum <= 9) {
            currentNum = currentNum - 1;
            return currentNum;
        }
        if (currentNum == 0) {
            currentNum = 9;
        }
        return currentNum;
    }
    public int nextVolume() {
        if (currentVolume >= 0 && currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }
    public int prevVolume() {
        if (currentVolume > 0 && currentVolume <= 10) {
            currentVolume = currentVolume - 1;
            return currentVolume;
        }
        if (currentVolume == 0) {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }
}
