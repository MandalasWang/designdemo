package factorydesign;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/12/2 10:03
 * @description
 **/
public class PizzaStore {

    public String storeName;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    FactoryBean factoryBean;

    public PizzaStore(FactoryBean factoryBean) {
        this.factoryBean = factoryBean;
    }

    Pizza pizza1;

    public Pizza orderPizza(String type){
        pizza1 = factoryBean.CreatePizza(type);
        pizza1.prepare(storeName);
        pizza1.bake();
        pizza1.cut();
        pizza1.box();
        return pizza1;

    }



}
