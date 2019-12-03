package observedesign.impl;

import observedesign.Observe;
import observedesign.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/27 10:57
 * @description  主题具体实现类
 **/
public class WeatherData implements Subject {
    List<Observe> observes;
    private float tem;
    private float humidity;
    private float pressure;


    public WeatherData() {
        observes = new ArrayList<>();
    }

    @Override
    public void register(Observe obj) {
        observes.add(obj);
    }

    @Override
    public void removeObj(Observe obj) {
        observes.remove(obj);
    }

    @Override
    public void notifyObserve() {
        observes.forEach(x->{
            x.update(tem,humidity,pressure);
        });
    }

    public void messurementChanged(){
        notifyObserve();
    }

    public void setMessureMent(float tem,float humidity,float pressure){
        this.tem=tem;
        this.humidity =humidity;
        this.pressure=pressure;
    }
}
