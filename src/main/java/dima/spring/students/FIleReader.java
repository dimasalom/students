package dima.spring.students;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


import static java.lang.ClassLoader.getSystemClassLoader;

public class FIleReader {

    public File getFileFromResources(String fileName) throws URISyntaxException {

        ClassLoader loader = getSystemClassLoader();

        URL resource = loader.getResource(fileName);

        if (resource == null) {
            throw new IllegalArgumentException("File not found" + fileName);

        } else {
            return new File(resource.toURI());
        }
    }

    public List<String> getFileContent(File file) {

        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);

        } catch (IOException ex) {

            ex.printStackTrace();
        }

        return lines;
    }

}
