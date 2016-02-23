package com.telenordigital.abacourse;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PalindromeTest {

    @Test
    public void testPalindrome() {
        assertThat(Palindrome.isPalindrome("abba")).isTrue();
    }
}