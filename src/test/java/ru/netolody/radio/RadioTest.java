package ru.netolody.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void setMaxChannelPositiveTest (){
        int maxChannel = 20;
        Radio radio = new Radio (maxChannel);
        radio.setChannel(maxChannel-1);
        assertEquals(radio.getChannel(), (maxChannel-1));
    }

    @Test
    void setMaxChannelNegativeTest (){
        int maxChannel = 20;
        Radio radio = new Radio (maxChannel);
        radio.setChannel(maxChannel);
        assertEquals(radio.getChannel(), 0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/setChannelTestData.csv"})
    void setChannelDefaultTest(int channel, int expected) {
        Radio radio = new Radio();
        radio.setChannel(channel);
        int actual = radio.getChannel();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/prevChannelTestData.csv"})
    void prevChannelTest(int channel, int expected) {
        Radio radio = new Radio();
        radio.setChannel(channel);
        radio.prevChannel();
        int actual = radio.getChannel();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/nextChannelTestData.csv"})
    void nextChannelTest(int channel, int expected) {
        Radio radio = new Radio();
        radio.setChannel(channel);
        radio.nextChannel();
        int actual = radio.getChannel();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/setVolumeTestData.csv"})
    void setVolumeTest(int volume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(volume);
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/increaseVolumeTestData.csv"})
    void increaseVolumeTest(int volume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(volume);
        radio.increaseVolume();
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/decreaseVolumeTestData.csv"})
    void decreaseVolumeTest(int volume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(volume);
        radio.decreaseVolume();
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

}
