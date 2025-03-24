import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Пользователь вводит данные с клавиатуры в матрицу,

        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Вывод первой строки, умноженной на 3
        System.out.println("Первая строка, умноженная на 3:");
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[0][j] * 3 + " ");
        }
    }
}
