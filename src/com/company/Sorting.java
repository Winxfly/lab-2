package com.company;

import java.util.Arrays;

public class Sorting {

    //преобразование челого числа в массив чисел
    private int[] intToArray(int data) {
        String temp = Integer.toString(data);
        int[] newGuess = new int[temp.length()];

        int size = temp.length();
        for (int i = 0; i < size; i++) {
            newGuess[i] = temp.charAt(i) - '0';
        }
        return newGuess;
    }

    //в обратном виде
    public int revers(int data) {
        int temp = Integer.parseInt(new StringBuilder(String.valueOf(data)).
                reverse().toString());

        return temp;
    }

    //сортировка по возрастанию
    public String toMore(int data) {
        int[] copyArr = Arrays.copyOf(intToArray(data),
                intToArray(data).length);
        String sortArr = "";

        int size = copyArr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (copyArr[i] >= copyArr[j]) {
                    int temp = copyArr[i];
                    copyArr[i] = copyArr[j];
                    copyArr[j] = temp;
                }
            }
            sortArr += copyArr[i];
        }
        return sortArr;
    }

    //сортировка по убыванию
    public String toLess(int data) {
        int[] copyArr = Arrays.copyOf(intToArray(data),
                intToArray(data).length);
        String sortArr = "";

        int size = copyArr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (copyArr[i] <= copyArr[j]) {
                    int temp = copyArr[i];
                    copyArr[i] = copyArr[j];
                    copyArr[j] = temp;
                }
            }
            sortArr += copyArr[i];
        }
        return sortArr;
    }

    //чередовние наименьшего и наибольшего
    public String alternate(int data) {
        String copyLess = toLess(data);
        String sortArr = "";

        int a = copyLess.length() - 1;
        int b = 0;

        int size = copyLess.length();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                sortArr += copyLess.charAt(a);
                a--;
            } else {
                sortArr += copyLess.charAt(b);
                b++;
            }
        }
        return sortArr;
    }

    //нечетное кол-во цифр с повышением в центре
    public String centerUp(int data) {
        int[] copyArr = Arrays.copyOf(intToArray(data),
                intToArray(data).length);

        int size = copyArr.length;
        if (copyArr.length % 2 == 0) {
            size = copyArr.length - 1;
        }

        int maxNumber = copyArr[0];
        int maxIndex = 0;

        for (int i = 0; i < size; i++) {
            if (maxNumber <= copyArr[i]) {
                maxNumber = copyArr[i];
                maxIndex = i;
            }
        }

        int temp = copyArr[size / 2];
        copyArr[size / 2] = copyArr[maxIndex];
        copyArr[maxIndex] = temp;

        String sortArr = "";

        for (int i = 0; i < size; i++) {
            sortArr += copyArr[i];
        }

        return sortArr;
    }

    //нечетное кол-во цифр с понижением в центре
    public String centerDown(int data) {
        int[] copyArr = Arrays.copyOf(intToArray(data),
                intToArray(data).length);

        int size = copyArr.length;
        if (copyArr.length % 2 == 0) {
            size = copyArr.length - 1;
        }

        int minNumber = copyArr[0];
        int minIndex = 0;

        for (int i = 0; i < size; i++) {
            if (minNumber >= copyArr[i]) {
                minNumber = copyArr[i];
                minIndex = i;
            }
        }

        int temp = copyArr[size / 2];
        copyArr[size / 2] = copyArr[minIndex];
        copyArr[minIndex] = temp;

        String sortArr = "";
        for (int i = 0; i < size; i++) {
            sortArr += copyArr[i];
        }

        return sortArr;
    }
}