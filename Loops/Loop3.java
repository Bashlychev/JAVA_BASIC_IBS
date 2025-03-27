package Loops;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        double[] array = new double[size];
        double sum = 0;

        // 2. Посчитайте среднее арифметическое элементов массива.

        System.out.println("Введите " + size + " элементов массива типа double:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
            sum += array[i];
        }

        double average = sum / size;
        System.out.println("Среднее арифметическое: " + average);

        // 3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        System.out.println("Результат умножения каждого элемента на среднее:");
        for (int i = 0; i < size; i++) {
            double result = array[i] * average;
            System.out.printf("array[%d] * average = %.2f * %.2f = %.2f%n", i, array[i], average, result);
        }
    }
}
