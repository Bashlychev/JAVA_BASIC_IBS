package FinalTasks;

import java.util.*;

public class Final3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество строк: ");
        int n = Integer.parseInt(scanner.nextLine());

        String result = "";
        int maxUnique = -1;

        for (int i = 1; i <= n; i++) {
            System.out.print("Строка " + i + ": ");
            String line = scanner.nextLine();

            // Создать множество для подсчета уникальных символов
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : line.toCharArray()) {
                uniqueChars.add(c);
            }

            if (uniqueChars.size() > maxUnique) {
                maxUnique = uniqueChars.size();
                result = line;
            }
        }

        System.out.println("Ответ: " + result);
    }
}
