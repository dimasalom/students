package dima.spring.students.service;

import dima.spring.students.dao.QuestionsDaoImpl;

import java.io.File;
import java.net.URISyntaxException;

public class QuestionReaderImpl implements QuestionService {

    QuestionsDaoImpl reader;

    public QuestionReaderImpl(QuestionsDaoImpl reader) {
        this.reader = reader;
    }

    @Override
    public void askQuestion(String fileName) {
        try {
            File file = reader.getQuestionsReader().getFileFromResources(fileName);
            reader.getQuestionsReader().printFile(file);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void answer(String fileName) {
        try {
            File file = reader.getQuestionsReader().getFileFromResources(fileName);
            reader.getQuestionsReader().printFile(file);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

}
