package observedesign.impl;

import observedesign.DisplayElement;
import observedesign.Observe;
import observedesign.Subject;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/27 11:09
 * @description  布告栏观察者
 **/
public class CurrentConditionDisplay implements Observe, DisplayElement {

    private float tem;
    private float humidity;
    private float pressure;

    private Subject mateData;

    public CurrentConditionDisplay() {
    }

    public CurrentConditionDisplay(Subject obj) {
       this.mateData = obj;
       mateData.register(this);
    }
    @Override
    public void display() {
        System.out.println("CurrentConditionDisplay:温度 "+tem+" 湿度 "+humidity+" 压强 "+pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
          this.tem=temp;
          this.humidity=humidity;
          this.pressure=pressure;
          display();
    }
}
