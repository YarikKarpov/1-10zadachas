package zadanie10;
import java.util.Random;
import java.util.Scanner;

public class Математико{
    private static final int номервопроса = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        System.out.println("добро пожаловать в игру 'математико'!");
        System.out.println("нужно решить" + номервопроса + " задач.");

        for (int i = 0; i < номервопроса; i++) {
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            String operator = getRandomOperator();

            int correctAnswer = calculateAnswer(num1, num2, operator);

            System.out.println("задача " + (i + 1) + ": " + num1 + " " + operator + " " + num2 + " = ?");
            System.out.println("ваш ответ: ");
            int playerAnswer = scanner.nextInt();

            if (playerAnswer == correctAnswer) {
                System.out.println("правильно!");
                score++;
            } else {
                System.out.println("неправильно! правильный ответ: " + correctAnswer);
            }
        }

        System.out.println("игра окончена! Ваш счет: " + score + " из " + номервопроса);
        scanner.close();
    }

    private static String getRandomOperator() {
        String[] operators = {"+", "-", "*", "/"};
        Random random = new Random();
        return operators[random.nextInt(operators.length)];
    }

    private static int calculateAnswer(int num1, int num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return 0;
                }
            default:
                return 0;
        }
    }
}
