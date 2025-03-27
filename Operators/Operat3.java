package Operators;

import java.util.Scanner;

public class Operat3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int type = scanner.nextInt();

        if (type == 1) {
            // Конвертер массы
            System.out.println("Выберите единицу измерения: 1 - кг, 2 - фунт, 3 - унция, 4 - пуд");
            int unit = scanner.nextInt();

            System.out.println("Введите количество:");
            double amount = scanner.nextDouble();

            double kg = switch (unit) {
                case 1 -> amount;
                case 2 -> amount * 0.4536;
                case 3 -> amount * 0.02835;
                case 4 -> amount * 16.38;
                default -> 0;
            };

            System.out.println("Результат:");
            System.out.println("Килограммы: " + kg);
            System.out.println("Фунты: " + (kg / 0.4536));
            System.out.println("Унции: " + (kg / 0.02835));
            System.out.println("Пуды: " + (kg / 16.38));

        } else if (type == 2) {
            // Конвертер расстояния
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int unit = scanner.nextInt();

            System.out.println("Введите количество:");
            double amount = scanner.nextDouble();

            double meters = switch (unit) {
                case 1 -> amount;
                case 2 -> amount * 1609.34;
                case 3 -> amount * 0.9144;
                case 4 -> amount * 0.3048;
                default -> 0;
            };

            System.out.println("Результат:");
            System.out.println("Метры: " + meters);
            System.out.println("Мили: " + (meters / 1609.34));
            System.out.println("Ярды: " + (meters / 0.9144));
            System.out.println("Футы: " + (meters / 0.3048));
        } else {
            System.out.println("Ошибка: выбран неверный тип");
        }
    }
}

