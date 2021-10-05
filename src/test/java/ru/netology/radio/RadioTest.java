package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldIncreaseCurrentChannelUnderMaxChannel() {
        Radio radio = new Radio();
        int currentChannel = radio.getMaxChannel() - 1;
        int expected = radio.getMaxChannel();
        radio.setCurrentChannel(currentChannel);
        radio.increaseChannel();
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    public void shouldIncreaseCurrentChannelEqualMaxChannel() {
        Radio radio = new Radio();
        int currentChannel = radio.getMaxChannel();
        int expected = radio.getMinChannel();
        radio.setCurrentChannel(currentChannel);
        radio.increaseChannel();
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    public void shouldIncreaseCurrentChannelEqualMinFrequency() {
        Radio radio = new Radio();
        int currentChannel = 0;
        int expected = 1;
        radio.setCurrentChannel(currentChannel);
        radio.increaseChannel();
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    public void shouldDecreaseCurrentChannelOverMinChannel() {
        Radio radio = new Radio();
        int currentChannel = 1;
        int expected = 0;
        radio.setCurrentChannel(currentChannel);
        radio.decreaseChannel();
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    public void shouldDecreaseCurrentChannelEqualMinChannel() {
        Radio radio = new Radio();
        int currentChannel = 0;
        int expected = 9;
        radio.setCurrentChannel(currentChannel);
        radio.decreaseChannel();
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    public void shouldDecreaseCurrentChannelEqualMaxChannel() {
        Radio radio = new Radio();
        int currentChannel = 9;
        int expected = 8;
        radio.setCurrentChannel(currentChannel);
        radio.decreaseChannel();
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    public void shouldReturnCurrentChannelOverMaxChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(10);
        int expected = 0;
        assertEquals(expected, radio.getCurrentChannel());

    }

    @Test
    public void shouldReturnCurrentChannelUnderMinChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        int expected = 0;
        assertEquals(expected, radio.getCurrentChannel());

    }

    @Test
    public void shouldIncreaseCurrentVolumeUnderMaxVolume() {
        Radio radio = new Radio();
        int currentVolume = 9;
        radio.setCurrentVolume(currentVolume);
        int expected = 10;
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());


    }

    @Test
    public void shouldIncreaseCurrentVolumeEqualMaxVolume() {
        Radio radio = new Radio();
        int currentVolume = 10;
        radio.setCurrentVolume(currentVolume);
        int expected = 10;
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());


    }

    @Test
    public void shouldDecreaseCurrentVolumeOverMinVolume() {
        Radio radio = new Radio();
        int currentVolume = 1;
        radio.setCurrentVolume(currentVolume);
        int expected = 0;
        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());


    }

    @Test
    public void shouldDecreaseCurrentVolumeEqualMinVolume() {
        Radio radio = new Radio();
        int currentVolume = 0;
        radio.setCurrentVolume(currentVolume);
        int expected = 0;
        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());


    }

    @Test
    public void shouldReturnCurrentVolumeOverMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldReturnCurrentVolumeUnderMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }
}