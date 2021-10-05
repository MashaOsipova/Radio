package ru.netology.radio;

public class Radio {
    private int minChannel = 0;
    private int maxChannel = 9;
    private int currentChannel;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;

    public void increaseChannel() {
        if (currentChannel < maxChannel) {
            currentChannel = currentChannel + 1;
        } else {
            currentChannel = minChannel;
        }
    }

    public void decreaseChannel() {
        if (currentChannel > minChannel) {
            currentChannel = currentChannel - 1;
        } else {
            currentChannel = maxChannel;
        }
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel)
            return;
        if (currentChannel < minChannel)
            return;
        this.currentChannel = currentChannel;
    }

    void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume)
            return;
        if (currentVolume < minVolume)
            return;
        this.currentVolume = currentVolume;
    }
}
