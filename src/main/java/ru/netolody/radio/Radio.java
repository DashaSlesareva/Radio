package ru.netolody.radio;

public class Radio {

    private int channel;
    private int volume;
    private int maxChannel;

    public Radio(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public Radio() {
        this.maxChannel = 10;
    }

    public void setChannel(int channel) {
        if (channel < 0) {
            return;
        }
        if (channel > (maxChannel - 1)) {
            return;
        }
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void nextChannel() {
        if (this.channel == (maxChannel - 1)) {
            this.channel = 0;
        } else {
            this.channel++;
        }
    }

    public void prevChannel() {
        if (this.channel == 0) {
            this.channel = (maxChannel - 1);
        } else {
            this.channel--;
        }
    }


    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }


}
