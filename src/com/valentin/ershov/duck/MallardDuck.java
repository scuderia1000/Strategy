package com.valentin.ershov.duck;

import com.valentin.ershov.behavior.FlyWithWings;
import com.valentin.ershov.behavior.Quack;

/**
 * Created by Ershov-V-V on 14.02.2017.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
