package strategydesign.duckinterface.impl;

import strategydesign.duckinterface.QuckBehavior;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/27 14:01
 * @description
 **/
public class CanQuckImpl implements QuckBehavior {

    @Override
    public void quck() {
        System.out.println("这只鸭子会叫");
    }
}
