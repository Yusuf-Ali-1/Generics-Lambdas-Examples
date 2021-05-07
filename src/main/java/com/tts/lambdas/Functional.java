package com.tts.lambdas;


// this us a functional interface
// it can only have a single abstract method (SAM)
@FunctionalInterface
public interface Functional {
    void doSomething();

    // I cannot have two abstract methods inside of this interface
    // void doSomethingElse();
}
