package com.telenordigital.abacourse;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.io.Resources;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

    private Path getPath(final String resourceName) throws IOException, URISyntaxException {
        return Paths.get(Resources.getResource(resourceName).toURI());
    }
}