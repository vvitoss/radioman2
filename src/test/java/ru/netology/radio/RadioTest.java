package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @ParameterizedTest
    @CsvFileSource(resources = "/data_numberChanel.csv", delimiter = '|')
    void getNumberChanel(String testName,int numberChanel, int expected) {
        Radio radio = new Radio(numberChanel);
        assertEquals(expected, radio.getNumberChanel());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_getCurrentChanel.csv", delimiter = '|')
    void getCurrentChanel(String testName, int currentChanel, int expected) {
        // Radio radio = new Radio();
        radio.setCurrentChanel(currentChanel);

        assertEquals(expected, radio.getCurrentChanel());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_setCurrentChanel.csv", delimiter = '|')
    void setCurrentChanel(String testName, int currentChanel, int expected) {
        // Radio radio = new Radio();
        radio.setCurrentChanel(currentChanel);

        assertEquals(expected, radio.getCurrentChanel());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_next.csv", delimiter = '|')
    void next(String testName, int currentChanel, int expected) {
        // Radio radio = new Radio();
        radio.setCurrentChanel(currentChanel);
        radio.next();

        assertEquals(expected, radio.getCurrentChanel());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_prev.csv", delimiter = '|')
    void prev(String testName, int currentChanel, int expected) {
        // Radio radio = new Radio();
        radio.setCurrentChanel(currentChanel);
        radio.prev();

        assertEquals(expected, radio.getCurrentChanel());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_getCurrentVolume.csv", delimiter = '|')
    void getCurrentVolume(String testName, int currentVolume, int expected) {
        // Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_setCurrentVolume.csv", delimiter = '|')
    void setCurrentVolume(String testName, int currentVolume, int expected) {
        // Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_up.csv", delimiter = '|')
    void up(String testName, int currentVolume, int expected) {
        //Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.up();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_down.csv", delimiter = '|')
    void down(String testName, int currentVolume, int expected) {
        // Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.down();
        assertEquals(expected, radio.getCurrentVolume());
    }
}