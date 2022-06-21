package ru.netology.javaqa.radio.domain;

public class Radio {
    public int numberCurrentRadioStation;
    public int currentVolumeSound;
    public int maxNumberRadioStation = 9;
    public int minNumberRadioStation = 0;
    public int maxVolume = 10;
    public int minVolume = 0;


    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public int getCurrentVolumeSound() {
        return currentVolumeSound;
    }

    public int changeLastRadioStation() {
        if (numberCurrentRadioStation > maxNumberRadioStation) {
            numberCurrentRadioStation = minNumberRadioStation;
        } else {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
        }
        return numberCurrentRadioStation;
    }

    public int switchToThePreviousRadioStation() {
        if (numberCurrentRadioStation < minNumberRadioStation) {
            numberCurrentRadioStation = maxNumberRadioStation;
        } else {
            numberCurrentRadioStation = numberCurrentRadioStation - 1;
        }
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation > maxNumberRadioStation) {
            return;
        }
        if (newNumberCurrentRadioStation < minNumberRadioStation) {
            return;
        }
        numberCurrentRadioStation = newNumberCurrentRadioStation;
    }

    public void setIncreaseVolumeMax(int newCurrentVolumeSound) {
        if (newCurrentVolumeSound > maxVolume) {
            return;
        }
        currentVolumeSound = newCurrentVolumeSound + 1;
    }

    public void setDownVolume(int newCurrentVolumeSound) {
        if (newCurrentVolumeSound < minVolume) {
            return;
        }
        currentVolumeSound = newCurrentVolumeSound - 1;
    }

}



