import java.util.Scanner;

public class QuizApp {
    private static Scanner scanner = new Scanner(System.in);
    private static int currentQuestion = 0, score = 0;

    private static String[][] questions = {
            {"What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "3"},
            {"Which programming language is used for Android development?", "Java", "Python", "C++", "Swift", "1"},
            {"Who developed Java?", "Microsoft", "Sun Microsystems", "Google", "IBM", "2"},
            {"What is 5 + 3?", "5", "8", "10", "12", "2"}
    };

    public static void main(String[] args) {
        System.out.println("Welcome to the Quiz!");
        for (currentQuestion = 0; currentQuestion < questions.length; currentQuestion++) {
            askQuestion();
        }
        System.out.println("Quiz Over! Your Score: " + score + "/" + questions.length);
    }

    private static void askQuestion() {
        System.out.println("\n" + questions[currentQuestion][0]);
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + ". " + questions[currentQuestion][i]);
        }
        System.out.print("Your answer (1-4): ");
        int answer = scanner.nextInt();
        if (answer == Integer.parseInt(questions[currentQuestion][5])) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! The correct answer was: " + questions[currentQuestion][Integer.parseInt(questions[currentQuestion][5])]);
        }
    }
}
