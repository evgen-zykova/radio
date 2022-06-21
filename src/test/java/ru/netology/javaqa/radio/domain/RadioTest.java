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
        cond.numberCurrentRadioStation = 1;
        int expected = 2;
        int actual = cond.changeLastRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void previousRadioStation() {
        Radio cond = new Radio();
        cond.numberCurrentRadioStation = -1;
        int expected = 9;
        int actual = cond.switchToThePreviousRadioStation();

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

    public void soundReachedMax() {
        Radio cond = new Radio();

        cond.setIncreaseVolumeMax(11);
        int expected = 0;
        int actual = cond.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void soundReachedMin() {
        Radio cond = new Radio();

        cond.setDownVolume(-1);
        int expected = 0;
        int actual = cond.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);

    }

}
