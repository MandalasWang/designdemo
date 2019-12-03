package strategydesign;

import strategydesign.duckinterface.FlyBehavior;
import strategydesign.duckinterface.QuckBehavior;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/26 14:41
 * @description  超类
 **/
public abstract class Duck  {

    public FlyBehavior flyBehavior;

     public QuckBehavior quckBehavior;

    public void quck(){
          quckBehavior.quck();
    }

    public void fly(){
          flyBehavior.fly();
    }
    public void swimming(){
        System.out.println("鸭子都会游泳！");
    }

}
