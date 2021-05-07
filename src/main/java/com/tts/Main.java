package com.tts;

import java.util.ArrayList;
import java.util.List;

public class Main {


        public static <W> void printList( List<W> list) {
            for(W element : list) {
                System.out.println(element);
            }

        }

        // Using Generics, it is possible to create classes
        // that work with different data types.
        public static <T> T returnValue(T myValue){
            return myValue;
        }




        public static <T extends Comparable<T>> int greaterThan(T[] numArray, T element) {
            int count = 0;
            for (T e : numArray)
            if (e.compareTo(element) > 0)
                    ++count;
            return count;
        }

        public static <T, R> void printTwoGenerics(T x, R y) {
            System.out.println(x + " : " + y);
        }



    public static void main(String[] args) {


        // This is how we instantiate an arraylist
        // take note of the generic in the diamond <>
        // we use this generic to define a type in the interface List
        List<Integer> integerList = new ArrayList<>();

        integerList.add(4);
        integerList.add(45);
        integerList.add(3);
        integerList.add(645);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("from");
        stringList.add("a");
        stringList.add("generic");

        System.out.println("=== Integer data type ===");
        printList(integerList);

        System.out.println("\n=== String data type ===");
        System.out.println(returnValue("Hello"));

        System.out.println("\n=== Integer data type ===");
        System.out.println(returnValue(4000));

        System.out.println("\n=== String data type ===");
        printList(stringList);

        System.out.println("\n=== Two Generics ===");
        printTwoGenerics( 2000L , "this is a string omg");


        System.out.println("\n=== Raw Generic Class ===");
        GenericClass genericClass = new GenericClass<>("this is the generic", "Bob");




    }
}
