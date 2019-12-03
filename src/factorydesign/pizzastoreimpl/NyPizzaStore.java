package factorydesign.pizzastoreimpl;


import factorydesign.FactoryBean;
import factorydesign.PizzaStore;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/12/2 10:11
 * @description
 **/
public class NyPizzaStore extends PizzaStore {


    public NyPizzaStore(FactoryBean factoryBean) {
        super(factoryBean);
        this.storeName="NyPizzaStore";
    }
}
