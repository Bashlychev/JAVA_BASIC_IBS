package Data;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ввести первое число с клавиатуры и записать его в строковую переменную.
        System.out.print("Введите первое число (строкой): ");
        String strNumber = scanner.nextLine();
        int num1 = Integer.parseInt(strNumber); // Парсим для сравнения

        // 2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        System.out.print("Введите второе число (целое): ");
        int num2 = scanner.nextInt();

        // 3. Сравнить 2 числа и вывести большее на экран
        if (num1 > num2) {
            System.out.println("Большее число: " + num1);
        } else {
            System.out.println("Большее число: " + num2);
        }

        // 4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
        double min = Math.min(num1, num2);
        System.out.println("Меньшее число (в типе double): " + min);
    }
}
