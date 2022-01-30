package ru.netology.radio;

public class Radio {
    private int currentChanel;
    private int currentVolume;

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setCurrentChanel(int currentChanel) {
        if (currentChanel < 0) {
            currentChanel = 9;
        }
        if (currentChanel > 9) {
            currentChanel = 0;
        }
        this.currentChanel = currentChanel;
    }

    public void next() {
        setCurrentChanel(currentChanel = currentChanel +1);
    }

    public void prev() {
        setCurrentChanel(currentChanel = currentChanel -1);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public void up() {
        setCurrentVolume(currentVolume = currentVolume +1);
    }

    public void down() {
        setCurrentVolume(currentVolume = currentVolume -1);
    }

}
