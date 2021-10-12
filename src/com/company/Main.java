package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Л/Р №2\nВариант задачи №1");
        System.out.println("Разработать программу, генерирующую случайным" +
                "образом натуральное число\n из достаточно большого" +
                "диапазона и выводящую его на экран:\n в исходном виде," +
                "в обратном виде, по возрастанию, по убыванию,\n" +
                "чередование наименьшего и наибольшего, с повышением" +
                "в центре, с понижением в центре\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nМаксимальный размер ввода: 2 147 483 647\n");
        System.out.print("Введите минимальное положительное" +
                " значение диапазона: ");
        int min = 0;
        try {
            min = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Неверный ввод!");
        }

        System.out.print("Введите максимальное положительное" +
                " значение диапазона: ");
        int max = 0;
        try {
            max = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("\nНеверный ввод!");
        }

        System.out.print("Введите количество итераций: ");
        int iter = 0;
        try {
            iter = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("\nНеверный ввод!\nЗавершение программы");
        }

        int i = 0;
        while (i < iter) {
            try {
                Algorithm algorithm = new Algorithm(min, max);
            } catch (NumberFormatException e) {
                System.out.println("\nНеверный ввод!");
            }
            i++;
        }
    }
}
