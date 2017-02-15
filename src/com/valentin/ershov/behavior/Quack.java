package com.valentin.ershov.behavior;

/**
 * Created by Ershov-V-V on 14.02.2017.
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quack, quack...");
    }
}
