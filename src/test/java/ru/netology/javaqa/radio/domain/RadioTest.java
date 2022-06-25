package ru.netology.javaqa.radio.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void numberCurrentStation() {
        Radio cond = new Radio();

        int expected = 0;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void switchLastRadioStation() {
        Radio cond = new Radio();
        cond.setNumberCurrentRadioStation(9);
        cond.changeLastRadioStation();
        int expected = 0;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchToTheNextStation() {
        Radio cond = new Radio();
        cond.setNumberCurrentRadioStation(5);
        cond.changeLastRadioStation();
        int expected = 6;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void previousRadioStation() {
        Radio cond = new Radio();
        cond.setNumberCurrentRadioStation(0);
        cond.switchToThePreviousRadioStation();
        int expected = 9;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goToThePreviousStation() {
        Radio cond = new Radio();
        cond.setNumberCurrentRadioStation(8);
        cond.switchToThePreviousRadioStation();
        int expected = 7;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void directRadioStationSelection() {
        Radio cond = new Radio();
        cond.setNumberCurrentRadioStation(3);

        int expected = 3;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void currentStationMoreMax() {
        Radio cond = new Radio();
        cond.setNumberCurrentRadioStation(11);

        int expected = 0;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void currentStationLessMin() {
        Radio cond = new Radio();
        cond.setNumberCurrentRadioStation(-1);

        int expected = 0;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void soundReachedMax() {
        Radio cond = new Radio();
        cond.setCurrentVolumeSound(100);
        cond.upVolume();
        int expected = 100;
        int actual = cond.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void increaseCurrentVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolumeSound(5);
        cond.upVolume();
        int expected = 6;
        int actual = cond.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void soundReachedMin() {

        Radio cond = new Radio();
        cond.setCurrentVolumeSound(0);
        cond.downVolume();
        int expected = 0;
        int actual = cond.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void decreaseCurrentVolume() {

        Radio cond = new Radio();
        cond.setCurrentVolumeSound(58);
        cond.downVolume();
        int expected = 57;
        int actual = cond.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void currentVolumeSoundMoreMax() {
        Radio cond = new Radio();
        cond.setCurrentVolumeSound(101);

        int expected = 0;
        int actual = cond.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void currentVolumeSoundLessMin() {
        Radio cond = new Radio();
        cond.setCurrentVolumeSound(-1);

        int expected = 0;
        int actual = cond.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void currentStation() {
        Radio cond = new Radio(5, 30, 9, 0);

        Assertions.assertEquals(5, cond.getNumberCurrentRadioStation());
    }

    @Test

    public void currentVolume() {
        Radio cond = new Radio(5, 30, 9, 0);
       Assertions.assertEquals( 30, cond.getCurrentVolumeSound());

    }
    @Test

    public void maxAmountStation() {
        Radio cond = new Radio(5, 30, 9, 0);
        Assertions.assertEquals(9, cond.getMaxNumberRadioStation());
    }

    @Test

    public void minAmountStation() {
        Radio cond = new Radio(5, 30, 9, 0);
        Assertions.assertEquals(0, cond.getMinNumberRadioStation());
    }

}

