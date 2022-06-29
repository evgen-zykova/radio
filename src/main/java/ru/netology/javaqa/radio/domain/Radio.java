package ru.netology.javaqa.radio.domain;

public class Radio {

    private int numberCurrentRadioStation;
    private int currentVolumeSound;
    private int maxNumberRadioStation;
    private int minNumberRadioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
        maxNumberRadioStation = 9;
    }

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public int getCurrentVolumeSound() {
        return currentVolumeSound;
    }


    public Radio(int numberCurrentRadioStation) {
        maxNumberRadioStation = numberCurrentRadioStation - 1;
    }

    public void changeLastRadioStation() {
        if (numberCurrentRadioStation < maxNumberRadioStation) {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
        } else {
            numberCurrentRadioStation = minNumberRadioStation;
        }
    }

    public void switchToThePreviousRadioStation() {
        if (numberCurrentRadioStation > minNumberRadioStation) {
            numberCurrentRadioStation = numberCurrentRadioStation - 1;
        } else {
            numberCurrentRadioStation = maxNumberRadioStation;
        }
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

    public void setCurrentVolumeSound(int newCurrentVolumeSound) {
        if (newCurrentVolumeSound > maxVolume) {
            return;
        }
        if (newCurrentVolumeSound < minVolume) {
            return;
        }
        currentVolumeSound = newCurrentVolumeSound;
    }


    public void upVolume() {
        if (currentVolumeSound < maxVolume) {
            currentVolumeSound = currentVolumeSound + 1;
        }
    }

    public void downVolume() {
        if (currentVolumeSound > minVolume) {
            currentVolumeSound = currentVolumeSound - 1;
        }

    }

}



