package com;

public class Main {

    public static void main(String[] args) {

        System.out.println("Maximum number is " + findMax(6,2,3));

    }

    public static <E extends Comparable<E>> E findMax(E x, E y, E z){
        E max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
}
