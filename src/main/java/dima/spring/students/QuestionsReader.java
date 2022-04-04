package dima.spring.students;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;


import static java.lang.ClassLoader.getSystemClassLoader;

public class QuestionsReader {

    public File getFileFromResources(String fileName) throws URISyntaxException {

        ClassLoader loader = getSystemClassLoader();

        URL resource = loader.getResource(fileName);

        if (resource == null) {
            throw new IllegalArgumentException("File not found" + fileName);

        } else {
            return new File(resource.toURI());
        }
    }

    public void printFile(File file) {

        List<String> lines;

        try {
            lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);

            lines.forEach(System.out::println);

        } catch (IOException ex) {

            ex.printStackTrace();
        }
    }


}
