package com.telenordigital.abacourse;

import static com.telenordigital.abacourse.util.TestUtils.getPath;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.util.List;
import org.junit.Test;

public class FileToolTest {

    @Test
    public void setup() throws IOException, URISyntaxException {
        FileTool fileTool = new FileTool(getPath("first.txt"), getPath("second.txt"));

        List<String> actual = fileTool.getDiff();
        List<String> expected = Files.readAllLines(getPath("diff.txt"), UTF_8);

        assertThat(actual).isEqualTo(expected);
    }
}