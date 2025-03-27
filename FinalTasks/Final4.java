package FinalTasks;

import java.util.Scanner;

public class Final4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctAnswer = "заархивированный вирус";
        boolean usedHint = false;

        System.out.println("Загадка: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.");

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Ваш ответ: ");
            String userInput = scanner.nextLine().trim().toLowerCase();

            if (userInput.equals("подсказка")) {
                if (attempt == 1) {
                    System.out.println("Подсказка: Это нечто из ИТ-сферы, замаскированное и опасное.");
                    usedHint = true;
                    break; // После подсказки других попыток не даём
                } else {
                    System.out.println("Подсказка уже недоступна.");
                    continue;
                }
            }
            //Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
            if (userInput.equals(correctAnswer)) {
                System.out.println("Правильно!");
                return;
            } else {
                if (usedHint) {
                    System.out.println("Обидно, приходи в другой раз");
                    return;
                }

                if (attempt < 3) {
                    System.out.println("Подумай еще!");
                } else {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }
    }
}
