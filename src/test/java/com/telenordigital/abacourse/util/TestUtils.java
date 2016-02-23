package com.telenordigital.abacourse.util;

import com.google.common.io.Resources;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestUtils {

    public static Path getPath(final String resourceName) throws IOException, URISyntaxException {
        return Paths.get(Resources.getResource(resourceName).toURI());
    }
}