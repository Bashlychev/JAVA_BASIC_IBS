package FinalTasks;

import java.util.Scanner;

public class Final2 {
    //Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите уравнение (например, x+5=7): ");
        String input = scanner.nextLine();

        char a = input.charAt(0);
        char op = input.charAt(1);
        char b = input.charAt(2);
        char c = input.charAt(4);

        int x = 0;
//        Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
//        Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.

        if (a == 'x') {
            int bVal = Character.getNumericValue(b);
            int cVal = Character.getNumericValue(c);
            x = (op == '+') ? (cVal - bVal) : (cVal + bVal);
        } else if (b == 'x') {
            int aVal = Character.getNumericValue(a);
            int cVal = Character.getNumericValue(c);
            x = (op == '+') ? (cVal - aVal) : (aVal - cVal);
        } else if (c == 'x') {
            int aVal = Character.getNumericValue(a);
            int bVal = Character.getNumericValue(b);
            x = (op == '+') ? (aVal + bVal) : (aVal - bVal);
        }

        System.out.println(x);
    }
}
