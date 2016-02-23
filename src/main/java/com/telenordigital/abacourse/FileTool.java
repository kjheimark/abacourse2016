package com.telenordigital.abacourse;

import static java.nio.charset.StandardCharsets.UTF_8;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileTool {

    public FileTool(Path first, Path second) throws IOException {
        List<String> linesOfFirst = Files.readAllLines(first, UTF_8);
        List<String> linesOfSecond = Files.readAllLines(second, UTF_8);
    }

    /**
     * Simple diff tool, which works quite similar to running diff in the command line
     *
     * Output if a line is present in first, but NOT in second:
     * "< content of line"
     *
     * Output if a line is NOT present in first, but in second:
     * "> content of line"
     * @return Diff between first and second
     */
    public List<String> getDiff() {
        return ImmutableList.of();
    }
}
