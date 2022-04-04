package dima.spring.students;


import dima.spring.students.service.QuestionReaderImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URISyntaxException;

public class StudentsApplication {

    public static void main(String[] args) throws URISyntaxException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        String fileName = "questions.csv";

        QuestionReaderImpl service = context.getBean(QuestionReaderImpl.class);

        service.askQuestion(fileName);

    }
}
