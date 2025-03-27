package Operators;

import java.util.Scanner;

public class Operat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ввести три числа с клавиатуры x, y, z
        System.out.print("Введите число x: ");
        int x = scanner.nextInt();
        System.out.print("Введите число y: ");
        int y = scanner.nextInt();
        System.out.print("Введите число z: ");
        int z = scanner.nextInt();

        // 2. Найти и вывести в консоль среднее арифметическое этих чисел
        double average = (x + y + z) / 3.0;
        System.out.println("Среднее арифметическое: " + average);

        // 3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        int result = (int) Math.floor(average / 2);
        System.out.println("Округлённый результат: " + result);

        // 4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
