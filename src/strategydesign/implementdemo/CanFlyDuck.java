package strategydesign.implementdemo;

import strategydesign.Duck;
import strategydesign.duckinterface.impl.CanFlyImpl;
import strategydesign.duckinterface.impl.NoWayQuckImpl;


/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/26 14:48
 * @description  会飞的鸭子
 **/
public class CanFlyDuck extends Duck  {

    public CanFlyDuck() {
        this.flyBehavior = new CanFlyImpl();
        this.quckBehavior = new NoWayQuckImpl();
    }

    public void display(){
        System.out.println("会飞的鸭子却不会叫");
    }
}
