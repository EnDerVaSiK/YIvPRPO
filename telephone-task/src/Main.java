import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    // Выносим регулярное выражение в константу для оптимизации
    private static final String REGEX = "(?:\\+7|8|7)?\\s*\\(?(\\d{3})\\)?\\s*[- ]?\\s*(\\d{3})\\s*[- ]?\\s*(\\d{2})\\s*[- ]?\\s*(\\d{2})";
    private static final Pattern PHONE_PATTERN = Pattern.compile(REGEX);

    public static void main(String[] args) {
        // Путь к файлу с номерами телефонов
        String inputFilePath = "telephone-task/input.txt";
        // Путь для файла с результатом
        String outputFilePath = "telephone-task/output.txt";

        try {
            // Читаем весь текст из файла в одну строку
            String text = new String(Files.readAllBytes(Paths.get(inputFilePath)), StandardCharsets.UTF_8);
            System.out.println("Исходный текст из файла:");
            System.out.println(text);

            Matcher matcher = PHONE_PATTERN.matcher(text);
            String resultText = matcher.replaceAll("+1 ($1) $2-$3-$4");

            System.out.println("\nИсправленный текст:");
            System.out.println(resultText);

            // Сохраняем результат в новый файл
            Files.write(Paths.get(outputFilePath), resultText.getBytes(StandardCharsets.UTF_8));
            System.out.println("\nУспех! Результат сохранен в файл: " + outputFilePath);

        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
        }
    }
}
