package decoratordesign.juice;

import decoratordesign.Beverage;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/28 13:50
 * @description Espresso  饮料
 **/
public class Espresso extends Beverage {


    public Espresso() {
        description = "Espresso:";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
