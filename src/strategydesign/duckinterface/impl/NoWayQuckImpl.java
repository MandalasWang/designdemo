package strategydesign.duckinterface.impl;

import strategydesign.duckinterface.QuckBehavior;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/27 14:02
 * @description
 **/
public class NoWayQuckImpl implements QuckBehavior {


    @Override
    public void quck() {
        System.out.println("这只鸭子不会叫");
    }
}
