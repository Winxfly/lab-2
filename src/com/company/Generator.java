package com.company;

public class Generator {
    public int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}