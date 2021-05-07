package com.tts.lambdas;

public class Main {

    public static void main(String[] args) {

        // this is an anonymous inner class
        Functional myFunctional = new Functional() {
            @Override
            public void doSomething() {

            }
        };
    }
}

class FunctionalImpl implements Functional{

    @Override
    public void doSomething() {

    }
}
