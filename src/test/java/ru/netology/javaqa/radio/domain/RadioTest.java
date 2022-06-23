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
        cond.setCurrentVolumeSound(10);
        cond.upVolume();
        int expected = 10;
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
        cond.setCurrentVolumeSound(8);
        cond.downVolume();
        int expected = 7;
        int actual = cond.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void currentVolumeSoundMoreMax() {
        Radio cond = new Radio();
        cond.setCurrentVolumeSound(11);

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

}
