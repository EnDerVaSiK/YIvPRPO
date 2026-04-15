import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        // Путь к нашему файлу с номерами телефонов
        String inputFilePath = "telephone-task/input.txt";

        try {
            // Читаем весь текст из файла в одну строку
            String text = new String(Files.readAllBytes(Paths.get(inputFilePath)));

            System.out.println("Исходный текст из файла:");
            System.out.println(text);

        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
        }
    }
}
