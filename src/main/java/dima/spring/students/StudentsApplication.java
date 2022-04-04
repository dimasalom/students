package dima.spring.students;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.net.URISyntaxException;

public class StudentsApplication {

    public static void main(String[] args) throws URISyntaxException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        String fileName = "questions.csv";

        QuestionsReader questionsReader = context.getBean(QuestionsReader.class);

        File file = questionsReader.getFileFromResources(fileName);

        questionsReader.printFile(file);

    }
}
