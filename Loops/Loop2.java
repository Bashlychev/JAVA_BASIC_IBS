package Loops;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите положительное целое число: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Сумма нечётных чисел от 1 до " + n + " равна: " + sum);
    }
}
