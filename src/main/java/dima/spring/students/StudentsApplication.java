package dima.spring.students;



import java.net.URISyntaxException;

public class StudentsApplication {

    public static void main(String[] args) throws URISyntaxException {
        FIleReader questionsReader = new FIleReader();
        Testing testing = new Testing(questionsReader, "questions.csv", "answers.csv");

        testing.askQuestion();
    }
}
