package zadanie5;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();


        String[] sentences = text.split("[.!?]");

        for (String sentence : sentences) {
            int vowelCount = 0;
            int consonantCount = 0;

            String lowerCaseSentence = sentence.toLowerCase();

            for (char ch : lowerCaseSentence.toCharArray()) {
                if (Character.isLetter(ch)) {
                    if (isVowel(ch)) {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }


            if (vowelCount > consonantCount) {
                System.out.println("В предложении: " + sentence.trim() + " больше гласных: " + vowelCount);
            } else if (consonantCount > vowelCount) {
                System.out.println("В предложении: " + sentence.trim() + " больше согласных:"  + consonantCount);
            } else {
                System.out.println("В предложении: " + sentence.trim() + " количество гласных и согласных равно.");
            }
        }

        scanner.close();
    }

    private static boolean isVowel(char ch) {
        return "аеёиоуыэюя".indexOf(ch) >= 0;
    }
}
