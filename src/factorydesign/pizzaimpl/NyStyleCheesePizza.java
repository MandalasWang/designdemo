package factorydesign.pizzaimpl;

import factorydesign.Pizza;
import factorydesign.PizzaStore;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/12/2 10:14
 * @description
 **/
public class NyStyleCheesePizza extends Pizza {



   public NyStyleCheesePizza(){

       this.name="纽约芝士pizza";
       this.price= 36.50;
       this.count = 10;
   }

}
