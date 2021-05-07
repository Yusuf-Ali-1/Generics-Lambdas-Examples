package com.tts.lambdas;

public class Main {

    public static void main(String[] args) {

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
