package factorydesign.pizzastoreimpl;


import factorydesign.FactoryBean;
import factorydesign.PizzaStore;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/12/2 10:28
 * @description
 **/
public class ZjgPizzaStore extends PizzaStore {

    public ZjgPizzaStore(FactoryBean factoryBean) {
        super(factoryBean);
        this.storeName="ZjgPizzaStore:";
    }
}
