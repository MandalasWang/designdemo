package factorydesign;

import factorydesign.pizzaimpl.NyStyleCheesePizza;
import factorydesign.pizzaimpl.NyStyleClamPizza;
import factorydesign.pizzaimpl.ZjgCheesepizza;
import factorydesign.pizzaimpl.ZjgClamPizza;

import java.util.function.Supplier;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/12/3 13:12
 * @description
 **/
public  class FactoryBean  {



    public Pizza CreatePizza(String type) {
        Supplier supplier =()->{
            if(PizzaStyle.NY_STYLE_CHEESE_PIZZA.getName().equals(type)){
                return new NyStyleCheesePizza();
            }
            if(PizzaStyle.ZJG_STYLE_CLAM_PIZZA.getName().equals(type)){
                return new ZjgClamPizza();
            }
            if(PizzaStyle.NY_STYLE_CLAM_PIZZA.getName().equals(type)){
                return new NyStyleClamPizza();
            }
            if(PizzaStyle.ZJG_STYLE_CHEESE_PIZZA.getName().equals(type)){
                return new ZjgCheesepizza();
            }
            return null;
        };
        return (Pizza)supplier.get();
    }
}
