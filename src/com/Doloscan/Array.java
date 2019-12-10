package com.Doloscan;

public class Array {

    int items[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int sum() {
        int sum = 0;
        for (int i = 0; i < items.length; i++)
            sum += items[i];
        return sum;

    }

    int length() {

        int length = items.length;
        return length;
    }

    void average() {

        sum();
        double average = sum() / length();
        System.out.println("Average value of array elements: " + average);
    }

    void even() {

        for (int i = 0; i < items.length; i++)
            if (items[i] % 2 == 0) {
                System.out.println("Even number: " + items[i]);
            }
    }

    void odd() {

        for (int i = 0; i < items.length; i++)
            if (items[i] % 2 != 0) {
                System.out.println("Odd number: " + items[i]);
            }
    }


}
