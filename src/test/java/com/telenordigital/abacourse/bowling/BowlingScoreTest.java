package com.telenordigital.abacourse.bowling;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import com.google.common.collect.ImmutableList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BowlingScoreTest {

    @Mock
    private Sensor sensor;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testScore() {
        when(sensor.getPinsDown()).thenReturn(3, 3);

        List<String> players = ImmutableList.of("Per", "Mia");
        BowlingScore bowlingScore = new BowlingScore(sensor, players);

        bowlingScore.addPinsDownFromSensor();
        assertThat(bowlingScore.getScore()).isEqualTo(3);

        bowlingScore.addPinsDownFromSensor();
        assertThat(bowlingScore.getScore()).isEqualTo(6);
    }

}