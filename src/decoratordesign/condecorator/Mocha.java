package decoratordesign.condecorator;

import decoratordesign.Beverage;
import decoratordesign.decorator.decoration;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/28 13:56
 * @description Mocha 装饰类
 **/
public class Mocha extends decoration {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
       return beverage.getDescription()+" +Mocha";

    }

    @Override
    public double cost() {
        return 2.00+ beverage.cost();
    }
}
