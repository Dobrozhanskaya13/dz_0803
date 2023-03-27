
public class Radio {
    private String name;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private boolean on;

    public Radio ( int maxRadioStation,
                   int minRadioStation,
                   int currentRadioStation,
                   int maxVolume,
                   int minVolume,
                   int currentVolume ) {
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
        this.currentRadioStation = currentRadioStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
    }

    public Radio () {
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getMaxRadioStation () {
        return maxRadioStation;
    }

    public int getMinRadioStation () {
        return minRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {

        this.currentRadioStation = currentRadioStation;
    }


    public void pressNextStation() {
        if (currentRadioStation >= maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void pressPrevStation() {
        if (currentRadioStation <= minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public void pressPlusVolume() {

        setCurrentVolume(currentVolume + 1);
    }

    public void pressMinusVolume() {

        setCurrentVolume(currentVolume - 1);
    }

    public int getMaxVolume () {
        return maxVolume;
    }
    public int getMinVolume () {
        return minVolume;
    }

}