package com.telenordigital.abacourse.bowling;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BowlingScore {

    private Sensor sensor;
    private List<String> players;

    public BowlingScore(Sensor sensor, List<String> players) {
        this.sensor = sensor;
        this.players = players;
    }

    /**
     * Add result from the bowling machine:
     * - Update score
     * - Update who the current player is
     */
    public void addPinsDownFromSensor() {
        int pinsDown = sensor.getPinsDown();
    }

    /**
     * @return Current player
     */
    public String getCurrentPlayer() {
        return null;
    }

    /**
     * @return Score for each player
     */
    public Map<String, Integer> getScore() {
        return new HashMap<>();
    }
}
