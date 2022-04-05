package dima.spring.students;

import java.io.File;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Scanner;

public class Testing {

    FIleReader questionsReader;

    List<String> questions;

    List<String> answers;

    Scanner scanner = new Scanner(System.in);

    File fileWithQuestions;

    File fileWithAnswers;

    private int correctAnswers;

    public Testing(FIleReader questionsReader, String questions, String answers) throws URISyntaxException {
        this.questionsReader = questionsReader;
        fileWithQuestions = questionsReader.getFileFromResources(questions);
        fileWithAnswers = questionsReader.getFileFromResources(answers);
        this.questions = questionsReader.getFileContent(fileWithQuestions);
        this.answers = questionsReader.getFileContent(fileWithAnswers);
    }

    public void askQuestion() {

        for (String question : questions) {

            System.out.println(question.toString());

            System.out.println("Please enter the answer:");

            int numberOfAnswer = scanner.nextInt();

            testQuestion(numberOfAnswer);
        }
        System.out.println("Quantity of correct answers: " + correctAnswers);
    }

    public boolean testQuestion(int numberOfAnswer) {

        for (String answer : answers) {

            int ansFromFile = Integer.parseInt(answer);

            if (numberOfAnswer == ansFromFile) {

                correctAnswers++;

                return true;
            }
        }
        return false;
    }


}
