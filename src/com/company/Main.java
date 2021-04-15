package com.company;
import java.util.Scanner;
import java.util.Scanner; // Scanner из пакета java.util

public class Main{

    public static void main(String[] args) {
        // Создание объекта Scanner
        Scanner input = new Scanner(System.in);
        // Запрос пользователю ввести три числа
        System.out.print("Введите три числа: ");
        double number1 = input.nextDouble();
        System.out.print("Введите три числа: ");
        int number2 = input.nextInt();
        System.out.print("Введите имя: ");
        String number3 = input.nextLine();
        // Вычисление средней
        // Вывод результата
        System.out.println("Среднее чисел " + number1 + " " + number2
                + " " + number3 + " равно " );
    }
}