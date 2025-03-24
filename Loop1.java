import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {

        final int X = 5;
        final int Y = 10;
        final int Z = 15;

        Scanner scanner = new Scanner(System.in);

        // 1. Пользователь вводит размер массива и данные с клавиатуры в массив
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите " + size + " элементов массива:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

//        2. Сравнить элементы массива с заранее заданными константами x, y, z.

        boolean found = false;
        for (int value : array) {
            if (value == X || value == Y || value == Z) {
                found = true;
                break;
            }
        }

        // 3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".

        if (found) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Совпадений не найдено");
        }
    }
}
