package strategydesign.duckinterface.impl;

import strategydesign.duckinterface.FlyBehavior;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/27 13:59
 * @description
 **/
public class CanFlyImpl implements FlyBehavior {


    @Override
    public void fly() {
        System.out.println("这只鸭子会飞");
    }
}
