package com.Doloscan;

public class Main {

    public static void main(String[] args) {

        Array array = new Array();

        System.out.println("Sum is: " + array.sum());
        System.out.println("Length of the array: " + array.length());
        array.average();
        array.even();
        array.odd();
    }
}
