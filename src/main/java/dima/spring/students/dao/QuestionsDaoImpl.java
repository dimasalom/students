package dima.spring.students.dao;

import dima.spring.students.domain.QuestionsReader;

public class QuestionsDaoImpl implements QuestionDao{
    @Override
    public QuestionsReader getQuestionsReader() {
        return new QuestionsReader();
    }
}
