package com.valentin.ershov;

import com.valentin.ershov.behavior.FlyRocketPowered;
import com.valentin.ershov.duck.Duck;
import com.valentin.ershov.duck.MallardDuck;
import com.valentin.ershov.duck.ModelDuck;

/**
 * Created by Ershov-V-V on 14.02.2017.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
