package com.telenordigital.abacourse;

import static com.telenordigital.abacourse.util.TestUtils.getPath;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Files;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void testPalindrome() {
        assertThat(Palindrome.isPalindrome("abba")).isTrue();
    }

    @Test
    public void testPalindromesFromFile() throws Exception {
        final long numberOfPalindromes = Files.lines(getPath("possiblePalindromes.txt"), UTF_8)
                .filter(Palindrome::isPalindrome)
                .count();

        assertThat(numberOfPalindromes).isEqualTo(4);

        // If removing all non-alphanumerical chars and converting to lower case
        // assertThat(numberOfPalindromes).isEqualTo(46);
    }
}