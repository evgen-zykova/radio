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

    public int setChangeLastRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation < maxNumberRadioStation) {
            numberCurrentRadioStation = newNumberCurrentRadioStation + 1;
        } else {
            numberCurrentRadioStation = minNumberRadioStation;
        }
        return newNumberCurrentRadioStation;
    }

    public int setSwitchToThePreviousRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation > minNumberRadioStation) {
            numberCurrentRadioStation = newNumberCurrentRadioStation - 1;
        } else {
            numberCurrentRadioStation = maxNumberRadioStation;
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


    public void setUpVolume(int newCurrentVolumeSound) {
        if (newCurrentVolumeSound < maxVolume) {
            currentVolumeSound = newCurrentVolumeSound + 1;
        }

    }

    public void setDownVolume(int newCurrentVolumeSound) {
        if (newCurrentVolumeSound > minVolume) {
            currentVolumeSound = newCurrentVolumeSound - 1;
        }

    }

}



