package com.tts;

import java.util.ArrayList;
import java.util.List;

public class Main {


        public static <W> void printList( List<W> list) {
            for(W element : list) {
                System.out.println(element);
            }

        }

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


        printList(integerList);

        System.out.println(returnValue("Hello"));

        System.out.println(returnValue(4000));

    }
}
