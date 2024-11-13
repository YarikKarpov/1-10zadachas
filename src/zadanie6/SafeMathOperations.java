package zadanie6;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeMathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;
            double quotient = divide(num1, num2);

            saveResultsToFile(num1, num2, sum, difference, product, quotient);
        } catch (InputMismatchException e) {
            System.err.println("Ошибка: введено некорректное значение. Пожалуйста, вводите только числа.");
        } catch (OutOfMemoryError e) {
            System.err.println("Ошибка: недостаточно памяти для выполнения операции.");
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static double divide(double numerator, double denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Ошибка: Деление на нуль невозможно.");
        }
        return numerator / denominator;
    }

    private static void saveResultsToFile(double num1, double num2, double sum, double difference, double product, double quotient) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("results.txt"))) {
            writer.write("Первое число: " + num1);
            writer.newLine();
            writer.write("Второе число: " + num2);
            writer.newLine();
            writer.write("Сумма: " + sum);
            writer.newLine();
            writer.write("Разность: " + difference);
            writer.newLine();
            writer.write("Произведение: " + product);
            writer.newLine();
            writer.write("Частное: " + quotient);
            writer.newLine();
        } catch (IOException e) {
            throw new IOException("Не удалось записать результаты в файл: " + e.getMessage());
        }
    }
}
