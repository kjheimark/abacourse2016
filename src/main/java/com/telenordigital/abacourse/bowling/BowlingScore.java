package com.telenordigital.abacourse.bowling;

public class BowlingScore {

    private Sensor sensor;

    public BowlingScore(Sensor sensor) {
        this.sensor = sensor;
    }

    public void addPinsDownFromSensor() {
        int pinsDown = sensor.getPinsDown();
    }

    public int getScore() {
        return 0;
    }
}
