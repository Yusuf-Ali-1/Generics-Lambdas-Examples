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


    public static void main(String[] args) {


        // this is how we instantiate an arraylist
        // take note of the generic in the diamond <>
        // we use this generic to define a type in the interface list
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


        printList(integerList);

        System.out.println(returnValue("Hello"));

        System.out.println(returnValue(4000));

    }
}
