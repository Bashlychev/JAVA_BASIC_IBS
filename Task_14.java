import java.util.Random;

public class Task_14 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20; // (0–40) → (-20 до 20)
        }

        // 1. Выведите максимальный и минимальный элемент массива.
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 2. Из максимального и минимального значения выведите наибольшее по модулю.
        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);

        // По модулю
        int maxByAbs = (Math.abs(max) > Math.abs(min)) ? max : min;
        System.out.println("Наибольшее по модулю: " + maxByAbs);
    }
}

