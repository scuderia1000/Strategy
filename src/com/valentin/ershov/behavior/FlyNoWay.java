package com.valentin.ershov.behavior;

/**
 * Created by Ershov-V-V on 14.02.2017.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
