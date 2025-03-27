package FinalTasks;

import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Final1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Курс доллара: ");
            double rate = Double.parseDouble(scanner.nextLine());

            System.out.print("Количество рублей: ");
            double rubles = Double.parseDouble(scanner.nextLine());

            double dollars = rubles / rate;

            // Итоговое значение должно быть округлено до двух знаков после запятой.

            BigDecimal result = new BigDecimal(dollars).setScale(2, RoundingMode.HALF_UP);

            System.out.println("Итого: " + result + " долларов");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите корректные числовые значения.");
        }
    }
}
