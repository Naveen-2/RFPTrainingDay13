package com;

public class FindMaximum<E extends Comparable<E>> {
    E x, y, z;
    public FindMaximum(E x, E y, E z){
        this.x = x;
        this.y = y;
        this.z = z;
        findMax(x,y,z);
    }

    public static void main(String[] args) {
        new FindMaximum(6,2,3);
        new FindMaximum(6.5,2.8,3.2);
        new FindMaximum("Apple","Peach","Banana");

    }

    public static <E extends Comparable<E>> E findMax(E x, E y, E z){
        E max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        System.out.println("Maximum is " + max);
        return max;
    }

}
