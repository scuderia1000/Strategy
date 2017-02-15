package com.valentin.ershov.duck;

import com.valentin.ershov.behavior.FlyNoWay;
import com.valentin.ershov.behavior.Quack;

/**
 * Created by Ershov-V-V on 14.02.2017.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
