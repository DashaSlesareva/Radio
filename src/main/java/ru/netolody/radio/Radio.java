package ru.netolody.radio;

public class Radio {

    private int channel;

    public void setChannel(int channel) {
        if (channel < 0) {
            return;
        }
        if (channel > 9) {
            return;
        }
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void nextChannel() {
        if (this.channel == 9) {
            this.channel = 0;
        } else {
            this.channel++;
        }
    }

    public void prevChannel() {
        if (this.channel == 0) {
            this.channel = 9;
        } else {
            this.channel--;
        }
    }


    private int volume;

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }


}
