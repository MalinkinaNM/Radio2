package ru.netology.statistic;

public class Radio {


    private int currentVolume;          // текущая громкость
    private int currentRadioStation;        // текущая радиостанция

    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return maxStation;
    }

    public void setCurrentRadioStation(int CurrentRadioStation) {  // установка радиостанции
        if (CurrentRadioStation < 0) {
            return;
        }
        if (CurrentRadioStation > maxStation) {
            return;
        }
        this.currentRadioStation = CurrentRadioStation;
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume > 100) {
            return;
        }
        if (CurrentVolume < 0) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }


    public void volumeUp() {                // увеличение громкости на 1
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {              // уменьшение громкости на 1
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


    public void next() {                // следущая радиостанция
        if (currentRadioStation < maxStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {                // предъидущая радиостанция
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxStation;
        }
    }

}
