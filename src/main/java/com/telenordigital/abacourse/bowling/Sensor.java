package com.telenordigital.abacourse.bowling;

public interface Sensor {

    /**
     * @return The number of pins down
     * @throws IllegalStateException If sensor is busy counting pins. Client should retry.
     */
    int getPinsDown() throws IllegalStateException;
}
