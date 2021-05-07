package com.tts.lambdas;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        // this is an anonymous inner class
        // myFunctional is the variable reference name
        Functional myFunctional = new Functional() {
            @Override
            public void doSomething() {
                System.out.println("This is an anonymous class");

            }
        };

        Functional myOtherFunctional = new FunctionalImpl();

        // List is an interface you can't instantiate it
        // it makes no sense to implement like this
//        List<Integer> myList = new List<Integer>() {
//
//        };

        Functional myLambdaFunctional = () -> System.out.println("This is an anonymous class");
        OtherFunctional otherLambda = (x, y) -> {
            System.out.println("I'm inside a multi-parameter lambda ");
            return x + y;
        };

        System.out.println(otherLambda.operation(5,4));

    }

}

class FunctionalImpl implements Functional{

    @Override
    public void doSomething() {

    }
}
