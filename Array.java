public class Array {
    public static void main(String[] args) {
        // 1. Задайте массив из 5 любых целых чисел
        int[] arr = {10, 20, 30, 40, 50};

        // 2. Поменяйте местами первый и последний элемент в массиве
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        // 3. Вывести в консоль результат суммы первого и среднего элемента

        int sum = arr[0] + arr[arr.length / 2];
        System.out.println("Сумма первого и среднего элементов: " + sum);
    }
}
