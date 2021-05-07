package com.tts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class A {}
class B extends A {}
class C extends B {}
class D extends B {}


public class Main {

        public void otherMethod(List<? extends B> lb){
            B b = lb.get(0);
        }


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

        // Wildcards ?
        private static double sum(List<? extends Number> list)
        {
            double sum=0.0;
            for (Number i: list)
            {
                sum+=i.doubleValue();
            }

            return sum;
        }


        // Wildcards refer to an unknown type
        // this acts similarly to utilizing a single named generic
        // however it doesn't enforce data types
        public static void printCollection(Collection<?> c, Collection<?> d){
            for(Object e: c){
                System.out.println(e);
            }

            for(Object e: d){
                System.out.println(e);
            }
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
        System.out.println(genericClass);

        System.out.println("\n=== Wildcards ? ==");

        // Upper Bounded Integer List
        List<Integer> list1= Arrays.asList(4,5,6,7);

        // printing the sum of elements in list
        System.out.println("Total sum is: "+sum(list1));

        // Double list
        List<Double> list2=Arrays.asList(4.1,5.1,6.1);

        // printing the sum of elements in list
        System.out.print("Total sum is:"+sum(list2));

        // printing our interList and stringList
        // using the printCollections method
        printCollection(integerList, stringList);










    }
}
