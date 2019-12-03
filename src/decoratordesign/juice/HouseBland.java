package decoratordesign.juice;

import decoratordesign.Beverage;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/28 13:53
 * @description HouseBland 饮料
 **/
public class HouseBland extends Beverage {


    public HouseBland() {
        description = "HouseBland:";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
