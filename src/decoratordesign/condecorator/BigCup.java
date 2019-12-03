package decoratordesign.condecorator;

import decoratordesign.Beverage;
import decoratordesign.decorator.decoration;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/28 15:44
 * @description
 **/
public class BigCup extends decoration {
    Beverage beverage;

    public BigCup(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return "大杯 "+beverage.getDescription() ;
    }


    @Override
    public double cost() {
        return 30 + beverage.cost();
    }
}
