package com.jauregui.developer.generics.utils;

public class GenericType {

    public static <T> void showItem(T item){
        System.out.println("The item is" + item.toString());
    }

    public static <T> T getItem(T item){
        System.out.println("The item is" + item.toString());
        return item;
    }

    public static <T> int sumItems(T[] items){
        int sum = 0;
        for(T item : items){
            sum += Integer.parseInt(item.toString());
        }
        return sum;
    }

    public static <T, V> void printItems(T t, V v){
        System.out.println(t.toString());
        System.out.println(v.toString());
    }

    /**
     * Generic methods exercise
     * Let's implement a generic method that checks 2 parameters share the same value or not!
     *
     * For example:
     *
     * checkEquality(12, 8) returns false
     *
     * checkEquality(10.5, 10.5) returns true
     *
     * checkEquality("Joe", "Joe") returns true
     *
     */
    public static <T> boolean checkEquality(T t, T t2){
        return t.equals(t2);
    }
}
