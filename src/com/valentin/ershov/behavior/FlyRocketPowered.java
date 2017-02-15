package com.valentin.ershov.behavior;

/**
 * Created by Ershov-V-V on 14.02.2017.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
