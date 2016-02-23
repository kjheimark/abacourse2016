package com.telenordigital.abacourse;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.Test;

public class StringsTest {

    @Test
    public void reverseNormalInput() {
        assertThat(Strings.reverse("Telenor Digital")).isEqualTo("latigiD roneleT");
    }

    @Test
    public void reverseEmptyInput() {
        assertThat(Strings.reverse("")).isEqualTo("");
    }

    @Test
    public void reverseNullInput() {
        assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(() -> Strings.reverse(null))
                .withMessage("Input cannot be null");
    }
}