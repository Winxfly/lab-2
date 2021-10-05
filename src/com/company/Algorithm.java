package com.company;

public class Algorithm {
    Generator generator = new Generator();
    Sorting sorting = new Sorting();

    public Algorithm(int min, int max) {
        int data = generator.rnd(min, max);
        System.out.println("\nРезультат анализа:");
        System.out.println("Исходное число:" + data);
        System.out.println("Обратный вид:" + sorting.revers(data));
        System.out.println("По возрастанию:" + sorting.toMoreSort(data));
        System.out.println("По убыванию:" + sorting.toLessSort(data));
        System.out.println("Чередование наименьшего и наибольшего:" +
                sorting.alternationSort(data));
        System.out.println("С повышением в центре:" +
                sorting.centerUpSort(data));
        System.out.println("С понижением в центре:" +
                sorting.centerDownSort(data));
    }
}