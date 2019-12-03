package decoratordesign.condecorator;

import decoratordesign.Beverage;
import decoratordesign.decorator.decoration;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/28 14:06
 * @description 配料 具体装饰类
 **/
public class Soy extends decoration {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
       return beverage.getDescription()+" +Soy";
    }

    @Override
    public double cost() {
        return 2.55+ beverage.cost();
    }
}
