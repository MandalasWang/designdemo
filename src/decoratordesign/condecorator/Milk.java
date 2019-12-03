package decoratordesign.condecorator;

import decoratordesign.Beverage;
import decoratordesign.decorator.decoration;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/28 14:04
 * @description Milk 具体装饰类
 **/
public class Milk extends decoration {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
       return beverage.getDescription()+" +Milk";
    }

    @Override
    public double cost() {
        return 2.0 + beverage.cost();
    }
}
