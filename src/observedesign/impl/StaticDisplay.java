package observedesign.impl;

import observedesign.DisplayElement;
import observedesign.Observe;
import observedesign.Subject;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/27 11:27
 * @description 观察者具体实现类
 **/
public class StaticDisplay implements Observe, DisplayElement {
    private float tem;
    private float humidity;
    private float pressure;

    private Subject mateData;


    public StaticDisplay() {
    }
    public StaticDisplay(Subject mateData) {
        this.mateData=mateData;
        mateData.register(this);
    }
    @Override
    public void display() {
        System.out.println("StaticDisplay :平均温度"+tem+" 平均湿度 "+humidity+"平均压强 "+pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity=humidity;
        this.tem=temp;
        this.pressure=pressure;
        display();
    }
}
