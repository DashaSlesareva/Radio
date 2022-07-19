package ru.netolody.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void setChannelTest() {
        Radio radio = new Radio();
        int expected = 3;
        radio.setChannel(3);
        int actual = radio.getChannel();
        assertEquals(expected, actual);
    }

}
