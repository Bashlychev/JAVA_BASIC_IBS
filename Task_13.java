import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Выведите слова, состоящие только из латиницы.
        System.out.println("Введите строку из слов, разделённых пробелами:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        int count = 0;

        System.out.println("Слова, состоящие только из латиницы:");

        // 2. Выведите количество этих слов.
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                System.out.println(word);
                count++;
            }
        }

        System.out.println("Количество слов из латинских букв: " + count);
    }
}
