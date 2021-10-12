package com.company;

public class Algorithm {
    Generator generator = new Generator();
    Sorting sorting = new Sorting();

    public Algorithm(int min, int max) {
        int data = generator.rnd(min, max);
        System.out.println("\nРезультат анализа:");
        System.out.println("Исходное число:" + data);
        System.out.println("Обратный вид:" + sorting.revers(data));
        System.out.println("По возрастанию:" + sorting.toMore(data));
        System.out.println("По убыванию:" + sorting.toLess(data));
        System.out.println("Чередование наименьшего и наибольшего:" +
                sorting.alternate(data));
        System.out.println("С повышением в центре:" +
                sorting.centerUp(data));
        System.out.println("С понижением в центре:" +
                sorting.centerDown(data));
    }
}